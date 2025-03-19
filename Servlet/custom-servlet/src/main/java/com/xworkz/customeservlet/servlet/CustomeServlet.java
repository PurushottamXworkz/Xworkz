package com.xworkz.customeservlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/submit")
	public class CustomeServlet extends HttpServlet{
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.print("get method");
		}
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.print("post method");
		}
		
		@Override
		public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.print("delete method");
		}
		@Override
		public void doHead(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.print("head method");
		}
		@Override
		public void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.print("put method");
		}
		
		@Override
		public void doOptions(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.print("options method");
		}
		@Override
		protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.print("trace method");
		}
		
}
