package com.xworkz.metroapp.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class MetroServlet implements Servlet{

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
		System.out.println("Metro web-site");
		System.out.println("-------------------------------------");
		
		String station=request.getParameter("station");
		System.out.println(station);
		
		String destination=request.getParameter("destination");
		System.out.println(destination);
		
		String tickets=request.getParameter("tickets");
		System.out.println(tickets);
		
		String name=request.getParameter("name");
		System.out.println(name);
		
		String address=request.getParameter("address");
		System.out.println(address);
		
	}
}
