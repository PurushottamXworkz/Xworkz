package com.xworkz.gstcal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/submit")
public class GSTCalculationServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		try {
			double price=Double.parseDouble(req.getParameter("price"));
			double gstrate=Double.parseDouble(req.getParameter("gstrate"));
			
			double gst=(price*gstrate)/100;
			double total=price+gst;
			
			writer.print("<HTML>");
			writer.print("<TITLE>");
			writer.print("GST result");
			writer.print("</TITLE>");
			writer.print("<BODY>");
			writer.print("GST Amount is :"+gst);
			writer.print("<br>");
			writer.print("TOTAL Amount is :"+total);
			writer.print("</BODY>");
			writer.print("</HTML>");
			
		}catch (NumberFormatException e) {
			writer.print("<H1>Invalid Number format</H1>");
		}
	}
}
