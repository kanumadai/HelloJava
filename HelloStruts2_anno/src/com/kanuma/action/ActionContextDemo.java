package com.kanuma.action;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.junit.Test;

import com.kanuma.Domain.Users;
import com.kanuma.service.UsersService;
import com.kanuma.service.Impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * request's process
 * @author Dynabook
 *
 */
@ParentPackage("struts-default") //farther package
//@Namespace("/users")
@Results({
		@Result(name = "findAllUsers",type = "dispatcher",location = "/success.jsp"),
		@Result(name = "actionContextDemo",type = "dispatcher",location = "/jsp/success_testDemo.jsp")
})
public class ActionContextDemo extends ActionSupport{

	private UsersService service = new UserServiceImpl();
	private HttpServletRequest request;

	/**
	 * 动作方法
	 * @return
	 */
	@Action("findAllUsers")
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
	/**
	 * 动作方法
	 * @return
	 */
	@Action("actionContextDemo")
	public String actionContextDemo() {
		//g
		//1.action context
		ActionContext context = ActionContext.getContext();
		context.put("actionContextDemo", "actionContextDemo");
		//2.app
		ServletContext appContext = ServletActionContext.getServletContext();
		appContext.setAttribute("appContext", "appContext");
		//3.
		Map<String, Object> appMap = context.getApplication();
		appMap.put("appMap", "appMap");
		
		//4.
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("session", "session");
		//5.
		Map<String, Object> sessMap = context.getSession();
		sessMap.put("sessMap", "sessMap");
		
		
		//6.ValueStack
		
		ValueStack vStack = context.getValueStack();
		Users user = new Users();
		user.setUserId("Dog");
		user.setPassword("hello");
		vStack.push(user);
		//	return the action name string	
		return "actionContextDemo";
		
	}
}
