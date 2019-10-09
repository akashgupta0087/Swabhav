package com.techlabs.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class UserCounter
 *
 */
@WebListener
public class UserCounter implements HttpSessionListener {

	ServletContext ctx = null;
	static int totalUserCount = 0, currentUserCount = 0;
	
	
    /**
     * Default constructor. 
     */
    public UserCounter() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	totalUserCount++;
    	currentUserCount++;
    	
    	ctx = se.getSession().getServletContext();
    	
    	ctx.setAttribute("totalUsers", totalUserCount);
    	ctx.setAttribute("currentUsers", currentUserCount);
    	
    }
    

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	currentUserCount--;
    	ctx.setAttribute("currentUsers", currentUserCount);
    }
	
}
