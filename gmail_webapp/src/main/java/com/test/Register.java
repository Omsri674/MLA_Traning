package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		String uname = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		User obj = new User();
		obj.setFullName(name);
		obj.setUserName(uname);
		obj.setPassword(pass);
		
		
		try {
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root@39");
			
			String sql = "insert into user_gmail(flname,username,password) values(?,?,?);";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, obj.getFullName());
			pst.setString(2, obj.getUserName());
			pst.setString(3, obj.getPassword());
			
			int x = pst.executeUpdate();
			
			if(x>0) {
//				RequestDispatcher rd = request.getRequestDispatcher("home.html");
//				rd.forward(request, response);
				
				response.sendRedirect("home.html");
				
			}else {
				out.println("<h3 algin='center' color='red' Registration failed...! Please retry..:(");
				RequestDispatcher rd = request.getRequestDispatcher("Register.html");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
