package com.techlabs.controller;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.AuthService;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("view/login.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accName = request.getParameter("name");
		String accPassword = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		AuthService service = new AuthService();
		if(service.validateUser(accName, accPassword)) {
			HttpSession session = request.getSession();
			session.setAttribute("loggedIn", accName);
			response.sendRedirect("profile");
		}
		else {
			request.setAttribute("message", "Invalid username or password");
			RequestDispatcher view = request.getRequestDispatcher("view/login.jsp");
			view.forward(request, response);
		}
	}

}
