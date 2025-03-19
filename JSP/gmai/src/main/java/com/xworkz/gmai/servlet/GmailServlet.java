package com.xworkz.gmai.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/submit")
public class GmailServlet extends HttpServlet{
	public GmailServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		req.setAttribute("email", email);
		req.setAttribute("password", password);
		rd.forward(req, resp);
	}
}
