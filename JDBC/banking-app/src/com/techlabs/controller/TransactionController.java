package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.BankService;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
    	System.out.println("Inside Transaction controller");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("view/transaction.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		float amount = Float.parseFloat(request.getParameter("amount"));
		String transaction = request.getParameter("transaction");
		BankService service = new BankService();
		String accName = (String)session.getAttribute("loggedIn");
		
		try {
			if(transaction.equals("Deposit")) {
				service.deposit(accName, amount);
				response.sendRedirect("profile");
			}
			
			else if(transaction.equals("Withdraw")) {
				service.withdraw(accName, amount);
				response.sendRedirect("profile");
			}
		}catch(SQLException se) {
			request.setAttribute("message", se.getMessage());
			RequestDispatcher view = request.getRequestDispatcher("view/transaction.jsp");
			view.forward(request, response);
		}
		
		
		
		
	}

}
