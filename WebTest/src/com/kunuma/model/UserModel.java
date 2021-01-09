package com.kunuma.model;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.kunuma.domain.User;
import com.kunuma.utils.JDBCUtils;

public class UserModel{

	public User loginProcess(User user) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from userInf where username = ? and password = ?";
		System.out.print("I'm here!");
		User resultUser = qRunner.query(sql, new BeanHandler<User>(User.class), user.getUsername(),user.getPassword());
		return resultUser;
	}
	
	
	
}