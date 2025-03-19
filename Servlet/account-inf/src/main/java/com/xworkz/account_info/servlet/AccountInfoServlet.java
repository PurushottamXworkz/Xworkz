package com.xworkz.account_info.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class AccountInfoServlet implements Servlet{

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
		System.out.println("This is account info");
		System.out.println("------------------------------------");
		String name=request.getParameter("name");
		System.out.println(name);
		
		int accountNum=Integer.parseInt(request.getParameter("accountnum"));
		System.out.println(accountNum);
		
		String bank=request.getParameter("bank");
		System.out.println(bank);
		
		String account=request.getParameter("account");
		System.out.println(account);
		
		String address=request.getParameter("address");
		System.out.println(address);
	}

}
