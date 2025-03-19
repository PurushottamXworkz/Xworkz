package com.xworkz.gamilapp.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignInServlet extends HttpServlet{
		public SignInServlet() {
			
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			RequestDispatcher rd = req.getRequestDispatcher("loginSuccess.jsp");
			
			System.out.println(req.getParameter("user"));
			System.out.println(req.getParameter("pass"));
			
			rd.forward(req, resp);
		}
}
