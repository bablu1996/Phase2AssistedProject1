package com.bablu.assistedproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		String username= req.getParameter("uname");
		String password= req.getParameter("pass");
		if(username.equals("admin") && password.equals("admin"))
		{
			out.print("Welcome "+username.toUpperCase());
			out.print("\n You Logged in Successfully");
		}
		else {
			
		}
	}
}

