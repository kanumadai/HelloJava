package com.kanuma.Dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kanuma.Dao.UsersDao;
import com.kanuma.Domain.Users;
import com.kanuma.JPAUtils.JPAUtils;

@Repository("UsersDao")	//insert into container
public class UsersDaoImpl implements UsersDao {
	@Autowired()	//insert into container
	private JdbcTemplate jdbcTemplate ;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override	
	public List<Users> findAll() {

		List<Users> users = new ArrayList<Users>();

		EntityManager em = JPAUtils.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

			Query query = em.createQuery("select a from Users a");
			users = query.getResultList();
			users.forEach(System.out::println);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			throw new RuntimeException(e);
		}finally {			
			em.close();
		}
		return users;
	}
	
	






}
