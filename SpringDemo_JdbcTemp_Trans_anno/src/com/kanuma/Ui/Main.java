package com.kanuma.Ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanuma.Dao.impl.StudentsDaoImpl;
import com.kanuma.Domain.Student;
import com.kanuma.service.StudentsService;
import com.kanuma.springconfig.SpringConfiguration;

//import com.kanuma.JdbcUtilsdemo1.JdbcUtils;
//import com.kanuma.JdbcUtilsdemo1.MyDataSource;

/**
 * 1.xml:bean,property,constructor-arg...
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		StudentsService ss = (StudentsService) ac.getBean("studentService");
//		StudentsDaoImpl studentDao = (StudentsDaoImpl) ac.getBean("studentDao");
//		
//		//List<Student> students = ss.findAllStudents();
//		
//		
//		List<Student> students = studentDao.queryStudentsUseBeanListHandler();
//		
//		
//		students.forEach(System.out::println);
		
		
		System.out.println(ss);
//		List<Student> students = ss.findAllStudents();
//		students.forEach(System.out::println);
		
		Student st1 = ss.findStudentByIdOne(1L);
		System.out.println(st1.toString());
		Student st2 = ss.findStudentByIdOne(2L);
		System.out.println(st2.toString());
		
		
		ss.changeScore(2L, 1L, 10);
		System.out.println("==========================");
		 st1 = ss.findStudentByIdOne(1L);
		System.out.println(st1.toString());
		 st2 = ss.findStudentByIdOne(2L);
		System.out.println(st2.toString());
	}
		


}
