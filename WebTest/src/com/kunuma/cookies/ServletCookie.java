package com.kunuma.cookies;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kunuma.utils.CookieUtils;

/**
 * Servlet implementation class ServletCookie
 */
@WebServlet("/ServletCookie")
public class ServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtils.findCookie(cookies, "lastVisitTime");
	
		if(cookie == null) {
			//first visit
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>Hello welcome to this website!</h1>");
			
		}
		else {
			// secend time
			//get last time
			String value = cookie.getValue();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>Your last visit is:"+value+"</h1>");
			
			
		}
	
		//get system time ,write into cookie
		Date date = new Date();
		Cookie ck = new Cookie("lastVisitTime",date.toString());
		//set path
		ck.setPath("/WebTest");
		//set age
		ck.setMaxAge(60*60);
		response.addCookie(ck);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
