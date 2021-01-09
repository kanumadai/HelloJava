package com.kanuma.Dao;

import java.util.List;

import com.kanuma.Domain.Student;
/**
 * 客户持久层接口
 * @author Dynabook
 *
 */
public interface StudentsDao {

	/**
	 * 
	 * @return
	 */
	List<Student> findAllStudents();

	/**
	 * 
	 * @param student
	 */
	void saveStudent(Student student);

	/**
	 * 
	 * @param student
	 */
	void updateStudent(Student student);

	/**
	 * 
	 * @param id
	 */
	void deleteStudent(long id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Student findStudentById(long id);


}
