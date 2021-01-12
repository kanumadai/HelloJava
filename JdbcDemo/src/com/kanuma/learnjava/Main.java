package com.kanuma.learnjava;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kanuma.C3p0.JdbcUtils;

//import com.kanuma.JdbcUtilsdemo1.JdbcUtils;
//import com.kanuma.JdbcUtilsdemo1.MyDataSource;

/**
 * App entry for Maven project.
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Student> students = queryStudentsDemo4();
		students.forEach(System.out::println);
	}
	
	
	
	
	/**
	 * 使用连接池，	使用DbUtils 使用ArrayListHandler	
	 */	
	static List<Student> queryStudentsDemo4() throws Exception {
		List<Student> students = new ArrayList<>();
		try {
			
			String sql= "SELECT * FROM students WHERE grade = ? AND score >= ?";
			
			DataSource ds = JdbcUtils.getDataSource();
			
			int size=	JdbcUtils.dataSource.getInitialPoolSize();
			System.out.println(size);
			size=	JdbcUtils.dataSource.getMinPoolSize();
			System.out.println(size);
			size=	JdbcUtils.dataSource.getMaxPoolSize();
			System.out.println(size);
			//使用连接池，	使用DbUtils
			QueryRunner queryRunner = new QueryRunner(ds);

			//使用ArrayListHandler	
			students = queryRunner.query(sql,new BeanListHandler<Student>(Student.class),2,60);
			return students;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//release ps
			//JdbcUtils.releaseJdbc(rs,ps,conn);
		}
		return students;
	}
	
	
	
	/**
	 * 使用连接池，	使用DbUtils 使用ArrayListHandler	
	 */	
	static List<Student> queryStudentsDemo3() throws Exception {
		List<Student> students = new ArrayList<>();
		try {
			
			String sql= "SELECT * FROM students WHERE grade = ? AND score >= ?";
			
			//使用连接池，	使用DbUtils
			QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());

			//使用ArrayListHandler	
			List<Object[]> objList = queryRunner.query(sql,new ArrayListHandler(),2,60);
			for(Object[] obj : objList) {
				System.out.println(Arrays.toString(obj));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//release ps
			//JdbcUtils.releaseJdbc(rs,ps,conn);
		}
		return students;
	}
	
	/**
	 * 	使用DbUtils使用ResultSetHandler对象
	 */	
	static List<Student> queryStudentsDemo2() throws Exception {
		List<Student> students = new ArrayList<>();
		try {
			
			String sql= "SELECT * FROM students WHERE grade = ? AND score >= ?";
				
			//使用DbUtils
			QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());

			//使用ResultSetHandler对象
			students = queryRunner.query(sql,new ResultSetHandler<List<Student>>() {

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
					}}, 2,60);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//release ps
			//JdbcUtils.releaseJdbc(rs,ps,conn);
		}
		return students;
	}
	
	/**
	 * 使用连接池，不使用DbUtils
	 */
	static List<Student> queryStudentsDemo1() throws Exception {
		List<Student> students = new ArrayList<>();
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs = null;
		//MyDataSource mds = new MyDataSource();
		try {
			
			//	conn = mds.getConnection(); 
			String sql= "SELECT * FROM students WHERE grade = ? AND score >= ?";
			
			//使用连接池，不使用DbUtils
			conn = JdbcUtils.getConnection();
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 2); // 髫ｨ�ｽｬ闕ｳ�ｿｽ闕ｳ�ｽｪ陷ｿ繧育�喩rade=?
			ps.setInt(2, 60); // 髫ｨ�ｽｬ闔�蠕｡�ｽｸ�ｽｪ陷ｿ繧育�嘖core=?
			rs = ps.executeQuery();
			while (rs.next()) {
				students.add(extractRow(rs));
			}							
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//release ps
			JdbcUtils.releaseJdbc(rs,ps,conn);
		}
		return students;
	}
/**
 * 
 * @param rs
 * @return
 * @throws SQLException
 */
	static Student extractRow(ResultSet rs) throws SQLException {
		var std = new Student();
		std.setId(rs.getLong("id"));
		std.setName(rs.getString("name"));
		std.setGender(rs.getBoolean("gender"));
		std.setGrade(rs.getInt("grade"));
		std.setScore(rs.getInt("score"));
		return std;
	}
	


}
