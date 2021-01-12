package com.kanuma.datasource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {

	private static final String driverClassName;
	private static final String jdbcUrl;
	private static final String jdbcUsername;
	private static final String jdbcPassword;
	
	static {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("src/db.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driverClassName = prop.getProperty("driverClassName");
		jdbcUrl = prop.getProperty("jdbcUrl");
		jdbcUsername = prop.getProperty("jdbcUsername");
		jdbcPassword = prop.getProperty("jdbcPassword");
	}
	
	public static void loadDriver() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection cnn = null;
		try {
			cnn = DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnn;
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
