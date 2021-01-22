package com.kanuma.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.kanuma.Domain.Users;
import com.kanuma.service.UsersService;
import com.kanuma.service.Impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * request's process
 * @author Dynabook
 *
 */
public class HelloAction extends ActionSupport{

	private UsersService service = new UserServiceImpl();
	private HttpServletRequest request;
	private HttpServletResponse response;
	private HttpSession session;

	/**
	 * 动作方法
	 * @return
	 */
	public String findAllUsers() {
		//get data from db
		List<Users> users = service.findAll();
		//get request object
		request = ServletActionContext.getRequest();
		//save data to attribute
		request.setAttribute("users", users);
		//	return the action name string	
		return "findAllUsers";
		
	}
	
}
