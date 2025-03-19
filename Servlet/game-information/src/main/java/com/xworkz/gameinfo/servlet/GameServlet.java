package com.xworkz.gameinfo.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class GameServlet implements Servlet{

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
		System.out.println("Game Information");
		System.out.println("---------------------------------------------");
		String name=request.getParameter("name");
		System.out.println(name);
		
		int ratings=Integer.parseInt(request.getParameter("ratings"));
		System.out.println(ratings);
		
		String version=request.getParameter("version");
		System.out.println(version);
		
		String developer=request.getParameter("developer");
		System.out.println(developer);
		
		String organisation=request.getParameter("organisation");
		System.out.println(organisation);
		
	}
}
