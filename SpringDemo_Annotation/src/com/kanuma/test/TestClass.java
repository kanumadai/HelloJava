package com.kanuma.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kanuma.Dao.impl.StudentsDaoImpl;
import com.kanuma.Domain.Student;
import com.kanuma.service.StudentsService;
import com.kanuma.springconfig.SpringConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class TestClass{
	
//	ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//	
//	StudentsService ss = (StudentsService) ac.getBean("studentService");
		@Autowired
		StudentsService ss =null;
		@Autowired
		StudentsDaoImpl studentDao = null;
		
		@Test
		public void testTest(){
		System.out.println(ss);
//		StudentsDaoImpl studentDao = (StudentsDaoImpl) ac.getBean("studentDao");
//		System.out.println(studentDao);
		//List<Student> students = ss.findAllStudents();
		
		
		List<Student> students = null;
		try {
			students = studentDao.queryStudentsUseBeanListHandler();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		students.forEach(System.out::println);
	}
}