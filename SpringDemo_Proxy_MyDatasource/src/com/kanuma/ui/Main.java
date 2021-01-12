package com.kanuma.ui;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import com.kanuma.Dao.impl.StudentsDaoImpl;
import com.kanuma.Domain.Student;
import com.kanuma.datasource.MyDataSource;

//import com.kanuma.JdbcUtilsdemo1.JdbcUtils;
//import com.kanuma.JdbcUtilsdemo1.MyDataSource;

/**
 * App entry for Maven project.
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
//		StudentsService ss = (StudentsService) ac.getBean("studentService");
//		StudentsDaoImpl studentDao = (StudentsDaoImpl) ac.getBean("studentDao");
		
		//List<Student> students = ss.findAllStudents();
		
		
//		List<Student> students = studentDao.queryStudentsUseBeanListHandler();
		
		
		int size1 = MyDataSource.getPoolSize();
		System.out.println(size1);
		Connection connection=	MyDataSource.getConnection();
		 size1 = MyDataSource.getPoolSize();
		System.out.println(size1);
		QueryRunner qRunner = new QueryRunner();
		
		StudentsDaoImpl studentDao = new StudentsDaoImpl();
		studentDao.setqRunner(qRunner);
		studentDao.setConnection(connection);
		List<Student> students = studentDao.queryStudentsUseBeanListHandler();
		connection.close();
		 size1 = MyDataSource.getPoolSize();
		System.out.println(size1);
		
		students.forEach(System.out::println);
	}
	
	
	
	

	


}
