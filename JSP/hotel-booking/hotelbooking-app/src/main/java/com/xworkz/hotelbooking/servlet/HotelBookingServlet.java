package com.xworkz.hotelbooking.servlet;

import java.io.IOException;

import com.xworkz.hotelbooking.dto.HotelBookingDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/submit")
public class HotelBookingServlet extends HttpServlet{
		public HotelBookingServlet() {
			
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			 String name = req.getParameter("name");
			 String email = req.getParameter("email");
			 long contact = Long.parseLong(req.getParameter("contact"));
			 long adharNumber = Long.parseLong(req.getParameter("adhar"));
			
			
			System.out.println(req.getParameter("email"));
			System.out.println(req.getParameter("fullname"));
			System.out.println(req.getParameter("contact"));
			System.out.println(req.getParameter("adhar"));
			
			
			
			HotelBookingDto dto = new HotelBookingDto();
			dto.setName(name);
			dto.setEmail(email);
			dto.setContact(contact);
			dto.setAdharNumber(adharNumber);
			
			System.out.println(name);
			System.out.println(email);
			System.out.println(adharNumber);
			System.out.println(contact);
			
			req.setAttribute("dto", dto);
			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			
			rd.forward(req, resp);
		}
}
