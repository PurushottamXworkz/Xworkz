package com.xworkz.passport.servlet;

import java.io.IOException;


import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class PassportServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Passport Website");
		
		String fname=request.getParameter("fname");
		System.out.println(fname);
		
		String lname=request.getParameter("lname");
		System.out.println(lname);
		
		String fathername=request.getParameter("fathername");
		System.out.println(fathername);
		
		String address=request.getParameter("address");
		System.out.println(address);
		
		String telephone = (request.getParameter("telephone"));
		System.out.println(telephone);
		
		
		
		
	}

}
