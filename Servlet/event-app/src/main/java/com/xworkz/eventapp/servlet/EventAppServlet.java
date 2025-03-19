package com.xworkz.eventapp.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class EventAppServlet implements Servlet{

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
		System.out.println("Event Management");
		System.out.println("--------------------------------------");
		
		String name=request.getParameter("name");
		System.out.println(name);
		
		String date=request.getParameter("date");
		System.out.println(date);
		
		String venue=request.getParameter("venue");
		System.out.println(venue);
		
		String landmark=request.getParameter("landmark");
		System.out.println(landmark);
		
		String contact=request.getParameter("contact");
		System.out.println(contact);		
		
	}

}
