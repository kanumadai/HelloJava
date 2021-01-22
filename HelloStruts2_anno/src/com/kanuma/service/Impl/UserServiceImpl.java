package com.kanuma.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanuma.Dao.UsersDao;
import com.kanuma.Dao.impl.UsersDaoImpl;
import com.kanuma.Domain.Users;
import com.kanuma.service.UsersService;
/**
 * 
 * @author Dynabook
 *
 */
@Service("studentService")	//insert into container
public class UserServiceImpl implements UsersService {

	@Autowired	//insert into container
	private UsersDao dao = new UsersDaoImpl();
	
	public void setDao(UsersDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}




}
