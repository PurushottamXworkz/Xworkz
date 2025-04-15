package com.xworkz.parkigsystem.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/submit")
public class ParkingSystemServlet extends HttpServlet{
	public ParkingSystemServlet() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		
		rd.forward(req, resp);
	}
}
