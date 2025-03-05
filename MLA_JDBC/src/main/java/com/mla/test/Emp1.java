package com.mla.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Emp1 {
	
public static void main(String[] args) {
	//1. Load the driver class 
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. create connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root@39");
		
		
		//3. Statement object 
		Statement stm = con.createStatement();
		
		
		//SQL query
//		String sql = "create table student(id int , name varchar(20), dept varchar(20))";
//		String sql = "insert into Student values(101,'Eswar','CSBS'),(102,'Kavi','CSE');";
		Student stu = new Student(504,"Om Sri","IT");
		List<Student> stul = new ArrayList<>();
		stul.add(new Student(103,"tharun","ECE"));
		stul.add(new Student(104,"Adhavan","EEE"));
		stul.add(new Student(105,"Deva","MCT"));
		stul.add(new Student(106,"Seeranjeevi","EIE"));
		stul.add(new Student(107,"Dharun","CS"));
//		String sql1 = "insert into Student value("+stu.getId()+", '"+stu.getName()+"','"+stu.getDept()+"');";
		// creating and doing CRUD operation on the database;
	//	String sql2 ="update ;" ;
//					for(Student s: stul) {
//						String sql1 = "insert into Student value("+s.getId()+", '"+s.getName()+"','"+s.getDept()+"');";
//						stm.execute(sql1);
//					}
		String sql = "select * from student";
		ResultSet rs = stm.executeQuery(sql);
		while(rs.next()) {
			System.out.println("ID:"+rs.getInt(1)+"Name: "+rs.getString(2)+"EMAIL: "+rs.getString(3));
		}
		
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnClassName(2));
		System.out.println(rsmd.getTableName(1));
		
		
		//4.Execute Query
		//stm.execute(sql1);
		
		//5. close the connection object 
	//	con.close();
		
		
		
		System.out.println("Done");
	}catch(Exception e) {
		e.printStackTrace();
	}

	
}
}
