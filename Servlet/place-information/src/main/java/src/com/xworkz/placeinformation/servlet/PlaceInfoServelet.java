package src.com.xworkz.placeinformation.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class PlaceInfoServelet implements Servlet{

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
		System.out.println("Place Information");
		System.out.println("---------------------------------------------");
		
		String name=request.getParameter("name");
		System.out.println(name);
		
		String source=request.getParameter("source");
		System.out.println(source);
		
		String destination=request.getParameter("destination");
		System.out.println(destination);
		
		int travellers=Integer.parseInt(request.getParameter("travellers"));
		System.out.println(travellers);
		
		
		int cost=Integer.parseInt(request.getParameter("travellers"));
		System.out.println(cost);
		
	}

}
