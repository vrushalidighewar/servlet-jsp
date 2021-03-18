package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {

	public void service(ServletRequest req,ServletResponse res) throws IOException, ServletException {
		
		String str="Hello World";	
		/*PrintWriter pw=res.getWriter();
		pw.write(str);*/
		
		req.setAttribute("msg", str);
		req.getRequestDispatcher("hello.jsp").forward(req, res);
	}
}
