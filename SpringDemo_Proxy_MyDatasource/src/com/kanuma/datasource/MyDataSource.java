package com.kanuma.datasource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDataSource {
	private static List<Connection> pooList =Collections.synchronizedList(new  ArrayList<>());

	static {
		for(int i=0;i<5;i++) {
			Connection conn = JdbcUtils.getConnection();
			pooList.add(conn);
		}
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		final Connection conn = pooList.remove(0);
		Connection connPoxy = (Connection) Proxy.newProxyInstance(conn.getClass().getClassLoader(), 
				conn.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						Object retObject = null;
						if("close".equals(method.getName())) {
							pooList.add(conn);
						}
						else {
							retObject = method.invoke(conn, args);
						}
						return retObject;
					}
				});				
		
		return connPoxy;
		
	}
	public static int getPoolSize() {
		return pooList.size();		
	}
}
