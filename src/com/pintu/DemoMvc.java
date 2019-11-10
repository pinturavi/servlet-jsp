package com.pintu;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc")
public class DemoMvc extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", "ravi");
		request.setAttribute("students", Arrays.asList(new Student("ravi", "chennai"), new Student("pintu", "gowda")));
		RequestDispatcher rd = request.getRequestDispatcher("jstl.jsp");
		rd.forward(request, response);
		
	}

}
