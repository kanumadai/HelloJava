package com.kanuma.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kanuma.Dao.impl.StudentsDaoImpl;
import com.kanuma.Domain.Student;
import com.kanuma.service.StudentsService;
import com.kanuma.springconfig.SpringConfiguration;

//import com.kanuma.JdbcUtilsdemo1.JdbcUtils;
//import com.kanuma.JdbcUtilsdemo1.MyDataSource;

/**
 * App entry for Maven project.
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		StudentsService ss = (StudentsService) ac.getBean("studentService");
		System.out.println(ss);
		StudentsDaoImpl studentDao = (StudentsDaoImpl) ac.getBean("studentDao");
		System.out.println(studentDao);
		//List<Student> students = ss.findAllStudents();
		
		
		List<Student> students = studentDao.queryStudentsUseBeanListHandler();
		
		
		students.forEach(System.out::println);
	}
	
	
	
	

	


}
