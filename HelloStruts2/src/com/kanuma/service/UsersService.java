package com.kanuma.service;

import java.util.List;
import com.kanuma.Domain.Users;

/**
 * service interface
 * @author Dynabook
 *
 */
public interface UsersService {

	/**
	 * get all students' infomation
	 * @return
	 */
	List<Users> findAll();
	
	
}
