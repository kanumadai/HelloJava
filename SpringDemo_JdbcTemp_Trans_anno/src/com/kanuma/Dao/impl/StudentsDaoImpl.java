package com.kanuma.Dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kanuma.Dao.StudentsDao;
import com.kanuma.Domain.Student;

@Repository("studentDao")	//insert into container
public class StudentsDaoImpl implements StudentsDao {
	@Autowired	//insert into container
	private JdbcTemplate jdbcTemplate ;
	
	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		try {
			return jdbcTemplate.query("select * from students", new BeanPropertyRowMapper<Student>(Student.class));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			jdbcTemplate.update("insert into students(name, gender,grade,score) values(?,?,?,?) ", student.getName(),
					student.isGender(), student.getGrade(), student.getScore(), student.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			jdbcTemplate.update("update students set name =?, gender =? ,grade=?,score =? where id =? ", student.getName(),
					student.isGender(), student.getGrade(), student.getScore(), student.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		try {
			jdbcTemplate.update("delete  from students where id =? ", id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Student> findStudentById(long id) {
		try {
			return jdbcTemplate.query("select * from students where id =? ", new BeanPropertyRowMapper<Student>(Student.class), id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public Student findStudentByIdOne(long id) {
		// TODO Auto-generated method stub
		List<Student> students= jdbcTemplate.query("select * from students where id =? ", new BeanPropertyRowMapper<Student>(Student.class), id);
		if(students.size()>1) {
			
			return null;
		}else {
			return students.get(0);
		}
		
	}
	
	/**
	 * 菴ｿ逕ｨ霑樊磁�ｿｽ??�ｿｽ? 菴ｿ逕ｨDbUtils 菴ｿ逕ｨArrayListHandler
	 */
	public List<Student> queryStudentsUseBeanListHandler() throws Exception {
		List<Student> students = new ArrayList<>();
		try {

			String sql = "SELECT * FROM students WHERE grade = ? AND score >= ?";

			// 菴ｿ逕ｨArrayListHandler
			students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class), 2, 60);
			return students;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return students;
	}







}
