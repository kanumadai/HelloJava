package com.kunuma.filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyServletRequest extends HttpServletRequestWrapper{

	private HttpServletRequest request;
	
	public MyServletRequest(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
		this.request = request;
	}

	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		String method = request.getMethod();
		String value = null;
		if("GET".equalsIgnoreCase(method)) {
			value = request.getParameter(name);
			try {
				value = new String(value.getBytes("ISO-8859-1"),"UTF-8");
				return value;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if("POST".equalsIgnoreCase(method)) {
			try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return getParameter(name);
	}

}
