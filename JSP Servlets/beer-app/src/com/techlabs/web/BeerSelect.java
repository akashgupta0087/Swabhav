package com.techlabs.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
@WebServlet("/SelectBeer.do")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BeerSelect() {
        System.out.println("Beer servlet created");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     out.println("Beer Selecttion Advice <br>");
     String c = request.getParameter("color");
     
     BeerExpert be = new BeerExpert();
     List results = be.getBrands(c);
     
//     for(Object result: results) {
//    	 out.print("<br> Try : " + result);
//     }
//     out.println("<br> Got beer color " + c);
     
     request.setAttribute("results",results);
     
     RequestDispatcher view = request.getRequestDispatcher("result.jsp");
     view.forward(request, response);
	}

}
