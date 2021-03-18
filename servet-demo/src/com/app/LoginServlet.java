package com.app;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
	}

}
