package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root@39");
		
		Statement stat = con.createStatement();
		String sql1 = "insert into student value(201,'Varun ','MECH');";
		String sql2 = "insert into student value(202,'Aarun ','ECE');";
		String sql3 = "insert into student value(203,'Dharun ','EEE');";
		
	
		stat.addBatch(sql1);
		stat.addBatch(sql2);
		stat.addBatch(sql3);
		
		
		
		stat.executeBatch();
		System.out.println("Done ra....");
	}

}
