package com.kanuma.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.kanuma.Domain.Users;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 有实体类，属性驱动请求参数封装
 * @author Dynabook
 *
 */
@ParentPackage("struts-default") //farther package
//@Namespace("/login")
@Results({
		@Result(name = "userLogin",type = "dispatcher",location = "/jsp/login_success.jsp"),
})
public class Login extends ActionSupport implements ServletRequestAware{

	private HttpServletRequest request;
	
	private Users user;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}


	/**
	 * 动作方法
	 * @return
	 */
	@Action("userLogin")
	public String userLogin() {

		System.out.println("login");
		System.out.println(user);
		request = ServletActionContext.getRequest();
		request.setAttribute("currentUser", user);
		
		return "userLogin";
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
}
