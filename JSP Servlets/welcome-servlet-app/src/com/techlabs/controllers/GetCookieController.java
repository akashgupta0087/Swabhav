package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieController
 */
@WebServlet("/getCookie")
public class GetCookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookieController() {
    	System.out.println("GetCookie servlet created");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bgColor = null;
	    PrintWriter out = response.getWriter();
	    
		Cookie[] cookies = request.getCookies();
		Cookie cookie = cookies[0];
		if(cookie.getName().equals("color"))
		    bgColor = cookie.getValue();
	
		out.print("<body bgcolor="+bgColor+">");
		
		if(cookie.getName().equals("color"))
		    out.print("<h1>Cookie found</h1>");
		else
		    out.print("<h1>Cookie not found</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
