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
import java.sql.ResultSet;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("fname");
		String uname = request.getParameter("user");
		String pass = request.getParameter("pwd");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "root@39");

			String sql = "select username, password from user_gmail where username = ? and password = ?";

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, uname);
			pst.setString(2, pass);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				if (rs.getString(1).equals(uname)) {
					RequestDispatcher rd = request.getRequestDispatcher("home.html");

					rd.forward(request, response);
				}
				break;
			}
			if (true) {
				out.println("<center> <h3><font color = 'red'> Login failed.</font> </h3></center>");

				RequestDispatcher rd = request.getRequestDispatcher("login.html");

				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
