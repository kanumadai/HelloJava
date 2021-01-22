package com.kanuma.action;

import java.sql.Date;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.kanuma.Domain.Users;
import com.kanuma.service.UsersService;
import com.kanuma.service.Impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 无实体类请求参数封装
 * @author Dynabook
 *
 */
@ParentPackage("struts-default") //farther package
//@Namespace("/users")
@Results({
		@Result(name = "testDemo3",type = "dispatcher",location = "/jsp/login_success.jsp")
})
public class HelloAction3 extends ActionSupport implements ModelDriven<Users>{
	
	private HttpServletRequest request;
	private Users user = new Users();
	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	/**
	 * 动作方法
	 * @return
	 */
	@Action("testDemo3")
	public String testDemo3() {
		System.out.println("demo3");
		System.out.println(user);		
		request = ServletActionContext.getRequest();
		request.setAttribute("currentUser", user);
		return "testDemo3";
		
	}
	
}
