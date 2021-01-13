package com.kanuma.Dao;

import java.util.List;

import com.kanuma.Domain.Student;
/**
 * 螳｢謌ｷ謖∽ｹ�螻よ磁蜿｣
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
	List<Student> findStudentById(long id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Student findStudentByIdOne(long id);
}
