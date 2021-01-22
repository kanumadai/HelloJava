package com.kanuma;

import java.util.List;


import com.kanuma.Domain.Users;
import com.kanuma.service.UsersService;
import com.kanuma.service.Impl.UserServiceImpl;

public class Test {

	@org.junit.Test
	public void test() {

		 UsersService service = new UserServiceImpl();

			List<Users> users = service.findAll();
			for (Users user : users) {
				System.out.println(user);
			}
	}

}
