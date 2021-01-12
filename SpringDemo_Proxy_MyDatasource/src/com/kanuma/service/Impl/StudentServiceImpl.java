package com.kanuma.service.Impl;

import java.util.List;

import com.kanuma.Dao.StudentsDao;
import com.kanuma.Domain.Student;
import com.kanuma.service.StudentsService;
/**
 * 
 * @author Dynabook
 *
 */
public class StudentServiceImpl implements StudentsService {

	private StudentsDao studentDao;
	
	public void setStudentDao(StudentsDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAllStudents();
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.saveStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);

	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(id);

	}

	@Override
	public Student findStudentById(long id) {
		return	studentDao.findStudentById(id);
		
	}


}
