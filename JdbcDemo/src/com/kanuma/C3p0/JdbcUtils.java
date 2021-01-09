package com.kanuma.C3p0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JdbcUtils {

	//a c3p0 object ,use c3p0's DataSource
	public static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	public static Connection getConnection() throws Exception {
		//�?配置�?件时
//		dataSource.setDriverClass("com.mysql.jdbc.Driver");
//		dataSource.setJdbcUrl("jdbc:mysql://192.168.100.130/learnjdbc?useSSL=false&characterEncoding=utf8");
//		dataSource.setUser("root");
//		dataSource.setPassword("lee");
//		
		//使用默认配置�?件?��c3p0-config.xml
		return dataSource.getConnection();
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	public static void releaseJdbc(Statement st,Connection cnn) {
		if(st != null) {
			try{
				st.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			st = null;
		}
		
		if(cnn != null) {
			try{
				cnn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			cnn = null;
		}
	}

	public static void releaseJdbc(ResultSet rs,Statement st,Connection cnn) {
		if(rs != null) {
			try{
				st.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			rs = null;
		}
		
		if(st != null) {
			try{
				st.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			st = null;
		}
		
		if(cnn != null) {
			try{
				cnn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			cnn = null;
		}
	}
}
