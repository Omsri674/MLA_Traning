package com.mla.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Emp2 {

	public static void main(String[] args) throws Exception
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root@39");
			
			String sql1 = "insert into student values(?,?,?);";
			/*
			 * Insertion operation by prepared statement
			PreparedStatement pst = con.prepareStatement(sql1);
			
			pst.setInt(1, 110);
			pst.setString(2, "Dhoni");
			pst.setString(3, "CSBS");
			
			
			updation using prepared statement
			
			String sql2 = "update student set name= ?, dept = ? where id= ?";
			PreparedStatement pst = con.prepareStatement(sql2);
			pst.setString(1, "Abishek");
			pst.setString(2, "IT");
			pst.setInt(3, 106);
			
			*/
			
			String sql3 = "delete from student where id = ?";
			PreparedStatement pst = con.prepareStatement(sql3);
			
			pst.setInt(1, 106);
			
			
			pst.execute();
			
			System.out.println("Excute aairuchu athu query aa typr panra.....");
			
			String sql = "select * from student";
			PreparedStatement pst1 = con.prepareStatement(sql);
			ResultSet rs = pst1.executeQuery();
			System.out.println();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			CallableStatement cst = con.prepareCall("{call readData}");
			ResultSet rsCst = cst.executeQuery();
			System.out.println();
			while(rsCst.next()) {
				System.out.println(rsCst.getInt(1)+" "+rsCst.getString(2)+" "+rsCst.getString(3));
			}
			
			
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}
	
}
