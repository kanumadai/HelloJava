package com.kanuma.Ui;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.junit.Test;

import com.kanuma.Domain.AccountInformation;
import com.kanuma.Domain.Users;
import com.kanuma.JPAUtils.JPAUtils;

//import com.kanuma.JdbcUtilsdemo1.JdbcUtils;
//import com.kanuma.JdbcUtilsdemo1.MyDataSource;

/**
 * 1.xml:bean,property,constructor-arg...
 * 
 * @author liaoxuefeng
 */
public class Main {


	
	/**
	 * Create
	 */
	@Test
	public void test1() {
		
		Users users = new Users();
		users.setUserId("TOM");
		users.setPassword("123");
		
		AccountInformation accInfo = new AccountInformation();
		accInfo.setLoginAccount("JpaTest");
		accInfo.setUserId("Amy");
		
		users.getAccountInfoSet().add(accInfo);
		accInfo.setUsers(users);
	
		EntityManager em = JPAUtils.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(users);
		em.persist(accInfo);
//		
		tx.commit();
		em.close();
	}
	
	/**
	 * Find
	 */
	@Test
	public void test2() {
		
		AccountInformation accInfo = new AccountInformation();
		Set<AccountInformation> accInfoSet = new HashSet<AccountInformation>();
		Users users = new Users();
		EntityManager em = JPAUtils.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//accInfo=	em.find(AccountInformation.class, 1L);
//		
		//System.out.println(accInfo);
		
		users=em.find(Users.class,4L);
		System.out.println(users.toString());
		
		accInfoSet = users.getAccountInfoSet();
		accInfoSet.forEach(System.out::println);
		
		tx.commit();
		em.close();
	}
	/**
	 * Find all
	 */
	@Test
	public void test3() {
		
		AccountInformation accInfo = new AccountInformation();
	
		EntityManager em = JPAUtils.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Query query = em.createQuery("select a from AccountInformation a");
		List<AccountInformation> accInfos=	query.getResultList();
		accInfos.forEach(System.out::println);
		tx.commit();
		em.close();
	}

	/**
	 * C3P0
	 */
	@Test
	public void testC3p0() {
		EntityManager em =JPAUtils.createEntityManager();
		
		Session ss = em.unwrap(Session.class);
		
		ss.doWork(new Work() {

			@Override
			public void execute(Connection arg0) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println(arg0.getClass().getName());
			}
			
		});
	}
}
