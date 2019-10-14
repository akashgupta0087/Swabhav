package com.techlabs.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.TransactionLog;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class DownloadCSVController
 */
@WebServlet("/downloadCSV")
public class DownloadCSVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadCSVController() {
    	System.out.println("Inside DownloadCSV Controller");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/csv");
	    response.setHeader("Content-Disposition", "attachment; filename=\"Passbook.csv\"");
	    BankService service = new BankService();
	    HttpSession session = request.getSession();
	    List<TransactionLog> transactions = service.getTransactions((String)session.getAttribute("loggedIn"));
	    try
	    {
	        OutputStream outputStream = response.getOutputStream();
	        String outputResult = "";
	        
	        for(TransactionLog transaction : transactions) { 
	        	outputResult += transaction.getAccName() + "," + transaction.getAmount() + "," + transaction.getTransactionType() + "," + transaction.getTransactionDate() + "\n";
	        }
	       
	        outputStream.write(outputResult.getBytes());
	        outputStream.flush();
	        outputStream.close();
	    }
	    catch(Exception e)
	    {
	        System.out.println(e.toString());
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
