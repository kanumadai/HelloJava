package com.kanuma.Domain;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanuma.Dao.impl.StudentsDaoImpl;
import com.kanuma.service.StudentsService;

//import com.kanuma.JdbcUtilsdemo1.JdbcUtils;
//import com.kanuma.JdbcUtilsdemo1.MyDataSource;

/**
 * 1.xml:bean,property,constructor-arg...
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		StudentsService ss = (StudentsService) ac.getBean("studentService");
		StudentsDaoImpl studentDao = (StudentsDaoImpl) ac.getBean("studentDao");
		
		//List<Student> students = ss.findAllStudents();
		
		
		List<Student> students = studentDao.queryStudentsUseBeanListHandler();
		
		
		students.forEach(System.out::println);
	}
	
	
	
	

	


}
