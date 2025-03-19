package com.xworkz.playstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class PlaystoreServlet implements Servlet{

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
	public void service(ServletRequest request, ServletResponse responses) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Playstore Application");
		System.out.println("--------------------------------------");
		String username=request.getParameter("username");
		System.out.println(username);
		
		String email=request.getParameter("email");
		System.out.println(email);
		
		String contact=request.getParameter("contact");
		System.out.println(contact);
		
		String productid=request.getParameter("productid");
		System.out.println(productid);
		
		String app=request.getParameter(productid);
		System.out.println(app);
			
		responses.setContentType("text/html");
		
		PrintWriter write=responses.getWriter();
		write.print("Requested Succcessfully");
		write.print("<HTML>");
		write.print("<TITLE>");
		write.print("Playstore");
		write.print("</TITLE>");
		write.print("</HTML>");
		write.close();
		
	}

	
}
