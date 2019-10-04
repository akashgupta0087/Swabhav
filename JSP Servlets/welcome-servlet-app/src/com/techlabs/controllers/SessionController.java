package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionController
 */
@WebServlet("/session")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionController() {
        System.out.println("Session servlet created");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int oldValue = 0;
	    int newValue = 0;

	     HttpSession session = request.getSession();

	    if(session.getAttribute("counter")!=null)
	    {
	        oldValue = (int)session.getAttribute("counter");
	        session.setAttribute("counter",oldValue+1);

	        newValue = (int)session.getAttribute("counter");
	    }
	    else{
	            session.setAttribute("counter",oldValue+1) ;  
	            newValue = (int)session.getAttribute("counter");    
	    }
	    
	    PrintWriter out = response.getWriter();
	    
	    out.print("<h1>Old Value : "+oldValue+"</h1>");
	    out.print("<h1>New Value : "+newValue+"</h1>");
	    out.print("<h1>Session Id : "+session.getId()+"</h1>");
	    
	    out.print("<a href='summary'>Summary</a>");
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
