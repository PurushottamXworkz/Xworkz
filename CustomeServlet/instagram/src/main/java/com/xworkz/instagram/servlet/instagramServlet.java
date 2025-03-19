package com.xworkz.instagram.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/submit")

public class instagramServlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer= resp.getWriter();
			
			try {
				String userName=req.getParameter("userName");
				String password=req.getParameter("password");
				writer.print("<HTML>");
				writer.print("<TITLE>");
				writer.print("instagram");
				writer.print("</TITLE>");
				writer.print("<BODY>");
				writer.print("Login Successsfully");
				writer.println("<br>");
				writer.print("User name :"+userName);
				System.out.println("user name :"+userName);
				writer.print("<br>");
				writer.print("password :"+password);
				System.out.println("Password :"+password);
				writer.print("</BODY>");
				writer.print("</HTML>");
			}catch (Exception e) {
				writer.print("<H1>Exception</H1>");
			}
		}
}
