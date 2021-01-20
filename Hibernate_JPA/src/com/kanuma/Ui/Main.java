package com.kanuma.Ui;


import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
	 * C
	 */
	@Test
	public void test1() {
		
		AccountInformation accInfo = new AccountInformation();
		accInfo.setLoginAccount("JpaTest");
		accInfo.setUserId("hillbilly");
	
		EntityManager em = JPAUtils.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
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
	
		EntityManager em = JPAUtils.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		accInfo=	em.find(AccountInformation.class, 1L);

		System.out.println(accInfo);
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

}
