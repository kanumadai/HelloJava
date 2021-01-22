package com.kanuma.service;

import java.util.List;
import com.kanuma.Domain.Student;

/**
 * service interface
 * @author Dynabook
 *
 */
public interface StudentsService {

	/**
	 * get all students' infomation
	 * @return
	 */
	List<Student> findAllStudents();
	
	/**
	 * 
	 */
	void saveStudent(Student student);
	
	/**
	 * 
	 */
	void updateStudent(Student student);
	
	/**
	 * 
	 */
	void deleteStudent(long id );
	
	/**
	 * 
	 */
	List<Student> findStudentById(long id);
	/**
	 * 
	 */
	Student findStudentByIdOne(long id);

	void changeScore(long sourceId, long targetId, int score);
}
