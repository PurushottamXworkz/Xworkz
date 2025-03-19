package com.xworkz.hospitalapp.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/test")
public class WelcomeServlet extends HttpServlet{
		public WelcomeServlet() {
			
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String user = req.getParameter("user");
			String pass = req.getParameter("pass");
			System.out.println(user);
			System.out.println(pass);
			RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
			req.setAttribute("user", user);
			req.setAttribute("pass", pass);
			
			rd.forward(req, resp);
		}
}
