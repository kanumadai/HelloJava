package com.kunuma.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.kunuma.domain.User;

public class PrivilegeFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// if already login ,let it go , else goback to login page
		HttpServletRequest req = (HttpServletRequest) arg0;
		User user = (User) req.getSession().getAttribute("existUser");
		if (user == null) {
			//
			req.setAttribute("msg", "You have not yet login, access is forbidden!");
			req.getRequestDispatcher("/login/login.jsp").forward(req, arg1);
		}
		else {
			arg2.doFilter(req, arg1);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}