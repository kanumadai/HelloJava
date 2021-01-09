package com.kanuma.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanuma.Dao.StudentsDao;
import com.kanuma.Domain.Student;
import com.kanuma.service.StudentsService;
/**
 * 
 * @author Dynabook
 *
 */
@Service("studentService")
public class StudentServiceImpl implements StudentsService {

	@Autowired
	private StudentsDao studentDao;
	

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
