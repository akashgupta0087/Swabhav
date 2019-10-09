package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		System.out.println("Inside login controller");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("loginForm.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");
		out.print("<h1> Welcome " + userName +"</h1>");
		
		
		HttpSession session = request.getSession();
        session.setAttribute("uname", userName);
        
        ServletContext ctx = getServletContext();
        int totalUsers = (Integer)ctx.getAttribute("totalUsers");
        int currentUsers = (Integer)ctx.getAttribute("currentUsers");
        
        out.print("<br> <h1>Total users visited : " + totalUsers + "</h1>");
        out.print("<br><h1>Current users logged in : " + currentUsers + "</h1>");

        out.print("<br><a href='logout'>Logout</a>");

        out.close();



	}

}
