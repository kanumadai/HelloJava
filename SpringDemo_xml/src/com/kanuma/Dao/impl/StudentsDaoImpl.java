package com.kanuma.Dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kanuma.Dao.StudentsDao;
import com.kanuma.Domain.Student;

public class StudentsDaoImpl implements StudentsDao {

	private QueryRunner qRunner;
	
	public void setqRunner(QueryRunner qRunner) {
		this.qRunner = qRunner;
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		try {
			return qRunner.query("select * from students", new BeanListHandler<Student>(Student.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			qRunner.update("insert into students(name, gender,grade,score) values(?,?,?,?) ", student.getName(),
					student.isGender(), student.getGrade(), student.getScore(), student.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			qRunner.update("update students set name =?, gender =? ,grade=?,score =? where id =? ", student.getName(),
					student.isGender(), student.getGrade(), student.getScore(), student.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		try {
			qRunner.update("delete  from students where id =? ", id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public Student findStudentById(long id) {
		try {
			return qRunner.query("select * from students where id =? ", new BeanHandler<Student>(Student.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	/**
	 * 使用连接�??�? 使用DbUtils 使用ArrayListHandler
	 */
	public List<Student> queryStudentsUseBeanListHandler() throws Exception {
		List<Student> students = new ArrayList<>();
		try {

			String sql = "SELECT * FROM students WHERE grade = ? AND score >= ?";

			// 使用ArrayListHandler
			students = qRunner.query(sql, new BeanListHandler<Student>(Student.class), 2, 60);
			return students;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return students;
	}

	/**
	 * 使用连接�??�? 使用DbUtils 使用ArrayListHandler
	 */
	public List<Student> queryStudentsUseArrayListHandler() throws Exception {
		List<Student> students = new ArrayList<>();
		try {

			String sql = "SELECT * FROM students WHERE grade = ? AND score >= ?";

			// 使用ArrayListHandler
			List<Object[]> objList = qRunner.query(sql, new ArrayListHandler(), 2, 60);
			for (Object[] obj : objList) {
				System.out.println(Arrays.toString(obj));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return students;
	}

	/**
	 * 使用DbUtils使用ResultSetHandler对象
	 */
	public List<Student> queryStudentsUseResultSetHandler() throws Exception {
		List<Student> students = new ArrayList<>();
		try {

			String sql = "SELECT * FROM students WHERE grade = ? AND score >= ?";

			// 使用ResultSetHandler对象
			students = qRunner.query(sql, new ResultSetHandler<List<Student>>() {

				@Override
				public List<Student> handle(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					List<Student> stdList = new ArrayList<>();
					while (rs.next()) {
						var std = new Student();
						std.setId(rs.getLong("id"));
						std.setName(rs.getString("name"));
						std.setGender(rs.getBoolean("gender"));
						std.setGrade(rs.getInt("grade"));
						std.setScore(rs.getInt("score"));

						stdList.add(std);
					}
					return stdList;
				}
			}, 2, 60);

		} catch (Exception e) {
			e.printStackTrace();
		} 
		return students;
	}


	/**
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public Student extractRow(ResultSet rs) throws SQLException {
		var std = new Student();
		std.setId(rs.getLong("id"));
		std.setName(rs.getString("name"));
		std.setGender(rs.getBoolean("gender"));
		std.setGrade(rs.getInt("grade"));
		std.setScore(rs.getInt("score"));
		return std;
	}

}
