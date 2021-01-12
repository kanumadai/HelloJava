package com.kanuma.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kanuma.Dao.impl.StudentsDaoImpl;
import com.kanuma.Domain.Student;


public class Client {
	/**
	 * 1.bean.xml->ClassPathXmlApplicationContext
	 * 2.studentDao->jdbcTemplate->DriverManagerDataSource->jdbc
	 * 3.jdbcTemplate:update,query
	 * param args
	 */
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
	

		StudentsDaoImpl studentDao = (StudentsDaoImpl) aContext.getBean("studentDao");
//		JdbcTemplate jt = (JdbcTemplate) aContext.getBean("jdbcTemplate");
//		StudentsDaoImpl studentDao = new StudentsDaoImpl();
//		studentDao.setqJdbcTemplate(jt);
		List<Student> students = studentDao.findAllStudents();
		
		students.forEach(System.out::println);
	}
}
