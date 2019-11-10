
package com.pintu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class SquareServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2159094594029125583L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		final int sum = (int) request.getSession().getAttribute("sum");//request.getAttribute("sum");
		
		final PrintWriter writer = response.getWriter();
		writer.println("result is " + sum * sum);
		writer.flush();
		writer.close();
	}

}
