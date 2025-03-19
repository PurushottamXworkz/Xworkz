package com.xworkz.foodordering.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class FoodOrderingServlet implements Servlet{

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
		String customername=request.getParameter("customername");
		System.out.println(customername);
		
		String foodname=request.getParameter("foodname");
		System.out.println(foodname);
		
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		System.out.println(quantity);
		
		int charges=Integer.parseInt(request.getParameter("charges"));
		System.out.println(charges);
		
		int total=Integer.parseInt(request.getParameter("total"));
		System.out.println(total);		
	}

}
