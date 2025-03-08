package com.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;


@WebServlet("/LIfeCycle_Exp")
public class LIfeCycle_Exp extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public LIfeCycle_Exp() {
        // TODO Auto-generated constructor stub
    	
    	
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("init()");
		
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("destroy()");
	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("service()...");
	}

}
