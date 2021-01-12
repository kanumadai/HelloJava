package com.kanuma.controller;

import java.util.List;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kanuma.Dao.impl.StudentsDaoImpl;
import com.kanuma.Domain.Student;
import com.kanuma.service.StudentsService;
import com.kanuma.service.Impl.StudentServiceImpl;
import com.kanuma.springconfig.SpringConfiguration;

//import com.kanuma.JdbcUtilsdemo1.JdbcUtils;
//import com.kanuma.JdbcUtilsdemo1.MyDataSource;

/**
 * 1.jdbc -> config->(import)->springconfig ->AnnotationConfigApplicationContext
 * 2.@ComponentScan:@Service("studentService"),@Autowired;
 * 					@Repository("studentDao"),,@Autowired;
 * 					@Component("PrintLog");
 * 3.@EnableAspectJAutoProxy:@Aspect,@Pointcut("execution(* com.kanuma.service.Impl.*.*(..))")
 * 							@Before,@AfterReturning,@AfterThrowing,@After,@Around	
 * @author kanuma
 */
public class Main {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		StudentsService ss = (StudentsService) ac.getBean("studentService");
		System.out.println(ss);
		StudentsDaoImpl studentDao = (StudentsDaoImpl) ac.getBean("studentDao");
		System.out.println(studentDao);
		List<Student> students = ss.findAllStudents();
		
		
		//List<Student> students = studentDao.queryStudentsUseBeanListHandler();
		
		
		students.forEach(System.out::println);
	}
	
	
	
	

	


}
