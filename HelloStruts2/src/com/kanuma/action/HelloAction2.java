package com.kanuma.action;

import java.sql.Date;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import com.kanuma.service.UsersService;
import com.kanuma.service.Impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 无实体类请求参数封装
 * @author Dynabook
 *
 */
public class HelloAction2 extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{

	private UsersService service = new UserServiceImpl();
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletContext context;
	
	private String username;
	private Integer age;
	private Date birthday;
	private String hobby;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	/**
	 * 动作方法
	 * @return
	 */
	public String testDemo() {
		System.out.println("HelloAction2 [username=" + username + ", age=" + age + ", birthday=" + birthday + ", hobby=" + hobby
				+ "]");
		return "testDemo";
		
	}

	@Override
	public String toString() {
		return "HelloAction2 [username=" + username + ", age=" + age + ", birthday=" + birthday + ", hobby=" + hobby
				+ "]";
	}

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context = context;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
}
