package com.test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class Mylistner implements HttpSessionListener {

	public static int totUser,currUser=0;
	
   	public static ServletContext ctx;
   	
   
    public void sessionCreated(HttpSessionEvent se)  { 

    	totUser++;
    	currUser++;
    	
    	ctx = se.getSession().getServletContext();
    	
    	ctx.setAttribute("total", totUser);
    	ctx.setAttribute("current", currUser);
    	
    }

    
    public void sessionDestroyed(HttpSessionEvent se)  { 

    		currUser--;
    		
    		ctx.setAttribute("current", currUser);
    	
    }
	
}
