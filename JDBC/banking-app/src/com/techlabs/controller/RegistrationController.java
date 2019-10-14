package com.techlabs.controller;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Account;
import com.techlabs.repository.BankRepository;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/registration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationController() {
		System.out.println("Inside registration controller");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("view/registration.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String errMsg = "";
		boolean isFailed = false;
		String accName = request.getParameter("name");
		String accPassword = request.getParameter("password");
		String balanceValue = request.getParameter("balance");
		float balance = Float.parseFloat(balanceValue);

		Account account = new Account(accName, accPassword, balance);

		BankService service = new BankService();

		try {
			service.addAccount(account);
		} catch (SQLException e) {
			errMsg = e.getMessage();
			isFailed = true;
		}

		if (isFailed) {
			request.setAttribute("message", errMsg);
			RequestDispatcher view = request.getRequestDispatcher("view/registration.jsp");
			view.forward(request, response);
		}
		else
			response.sendRedirect("welcome");

	}

}
