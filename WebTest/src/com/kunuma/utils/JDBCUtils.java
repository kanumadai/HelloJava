package com.kunuma.utils;

import java.sql.Connection;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JDBCUtils {

	//a c3p0 object ,use c3p0's DataSource
	public static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	public static Connection getConnection() throws Exception {
		//使用默认配置�?件?��c3p0-config.xml
		return dataSource.getConnection();
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
}
