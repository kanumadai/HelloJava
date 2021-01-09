package com.kanuma.JdbcUtilsdemo1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MyDataSource implements DataSource {
	//connection list 
	private List<Connection> connList = new ArrayList<Connection>();
	
	public MyDataSource() throws Exception{
		for(int i = 0; i<3 ;i++) {
			connList.add(JdbcUtils.getConnection());
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		Connection cnn = connList.remove(0);
		MyConnectionWrapper myconn = new MyConnectionWrapper(cnn,connList);
		return myconn;
	}


	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
