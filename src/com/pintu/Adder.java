package com.pintu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Adder extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		RequestDispatcher rd = request.getRequestDispatcher("square");
		int a = Integer.parseInt(request.getParameter("number1"));
		int b = Integer.parseInt(request.getParameter("number2"));
		int sum = a + b;
		System.out.println(sum);
		request.setAttribute("sum", sum);
		request.getSession().setAttribute("sum", sum);
		response.sendRedirect("square");
		//rd.forward(request, response);
	}
}
