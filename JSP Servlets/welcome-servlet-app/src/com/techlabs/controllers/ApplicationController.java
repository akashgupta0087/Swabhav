package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplicationController
 */
@WebServlet("/application")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationController() {
    	System.out.println("Application servlet created");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int oldValue = 0;
	    int newValue = 0;
	    
		ServletContext application = request.getServletContext();

	    if(application.getAttribute("counter")!=null)
	    {
	        oldValue = (int)application.getAttribute("counter");
	        application.setAttribute("counter",oldValue+1);

	        newValue = (int)application.getAttribute("counter");
	    }
	    else{
	            application.setAttribute("counter",oldValue+1) ;  
	            newValue = (int)application.getAttribute("counter");    
	    }
	    
	    PrintWriter out = response.getWriter();
	    
	    out.print("<h1>Old Value : "+oldValue+"</h1>");
	    out.print("<h1>New Value : "+newValue+"</h1>");
	    
	    out.print("<a href='summary'>Summary</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
