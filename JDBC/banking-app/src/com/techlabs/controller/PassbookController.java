package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.TransactionLog;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class PassbookController
 */
@WebServlet("/passbook")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassbookController() {
    	System.out.println("Inside Passbook controller");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String accName = (String) session.getAttribute("loggedIn");
		BankService service = new BankService();
		List<TransactionLog> transactions = service.getTransactions(accName);
		
		request.setAttribute("transactions", transactions);
		
		RequestDispatcher view = request.getRequestDispatcher("view/passbook.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
