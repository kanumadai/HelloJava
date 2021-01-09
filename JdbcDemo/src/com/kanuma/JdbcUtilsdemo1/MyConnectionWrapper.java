package com.kanuma.JdbcUtilsdemo1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MyConnectionWrapper extends ConnectionWrapper {

	private List<Connection> connList;
	private Connection conn;

	MyConnectionWrapper(Connection conn,List<Connection> connList){
		super(conn);
		this.conn = conn;
		this.connList = connList;
	}
	
	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub
		connList.add(conn);
	//	conn.close();
	}

}
