package com.kanuma.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kanuma.Dao.StudentsDao;
import com.kanuma.Domain.Student;
import com.kanuma.service.StudentsService;
/**
 * 
 * @author Dynabook
 *
 */
@Service("studentService")
@Transactional
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
	public List<Student> findStudentById(long id) {
		return	studentDao.findStudentById(id);
		
	}
	
	@Override
	public Student findStudentByIdOne(long id) {
		return	studentDao.findStudentByIdOne(id);
		
	}


	public void changeScore(long sourceId,long targetId,  int score) {
		// TODO Auto-generated method stub
		Student sourceStudent = studentDao.findStudentByIdOne(sourceId);
		Student targetStudent = studentDao.findStudentByIdOne(targetId);
		
		sourceStudent.setScore(sourceStudent.getScore()-score);
		targetStudent.setScore(targetStudent.getScore()+score);
		
		studentDao.updateStudent(sourceStudent);
		//int i = 1/0;
		studentDao.updateStudent(targetStudent);
		
	}

}
