package com.kunuma.servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kunuma.domain.User;
import com.kunuma.model.UserModel;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//loading at start
	public void init() {
		int count =0;
		this.getServletContext().setAttribute("count", count);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			//resp.getWriter().print("ServletLogin.....");
			
			//get the data
			req.setCharacterEncoding("UTF-8");
			
			String inputCheckcode  = req.getParameter("checkcode");
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			if(inputCheckcode.equals("") || password.equals("")||name.equals("")) {
				req.setAttribute("msg", "Please input username , password and checkcode.");
				req.getRequestDispatcher("/login/login.jsp").forward(req, resp);
				return;
			}
			//check the checkcode			
			String savedCheckcode = (String)req.getSession().getAttribute("checkcode");
			req.getSession().removeAttribute("checkcode");
			
			if(!savedCheckcode.equalsIgnoreCase(inputCheckcode)) {
				req.setAttribute("msg", "Checkcode is not right! Please input again.");
				req.getRequestDispatcher("/login/login.jsp").forward(req, resp);
				return;
			}
			//check the user
			//load the data
			User user = new User();
			user.setUsername(name);
			user.setPassword(password);
			//process the user
			UserModel userModel = new UserModel();
			User existUser = null;
			//User resultUser = new User();
			existUser = userModel.loginProcess(user);
			
			//judge the result
			
			if(existUser == null) {
				//faild
				req.setAttribute("msg", "Usename or password is not right, please try again.");
				req.getRequestDispatcher("/login/login.jsp").forward(req, resp);
				//resp.sendRedirect("/WebTest/login/loginSuccess.jsp");
			}
			else {
				//success
				int count = (int)this.getServletContext().getAttribute("count") +1;
				this.getServletContext().setAttribute("count", count);
				
				
				//session
				HttpSession session = req.getSession();
				session.setAttribute("existUser", existUser);
				
				String rememberCheck = req.getParameter("remember");
				if("true".equals(rememberCheck)){
					//check the rememberCheck
					Cookie cookie = new Cookie("remember",existUser.getUsername());
					cookie.setPath("/WebTest");
					cookie.setMaxAge(60*60*24);
					resp.addCookie(cookie);
				}
				
				resp.sendRedirect("/WebTest/login/loginSuccess.jsp");
				
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
