package com.mla.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Task1 {
public static void main(String[] args) throws Exception {
	
	
	
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root@39");
		
		Statement stat = con.createStatement();
		
		String sql = "create table orders(id int, name varchar(20), price int, mon int, year int, city varchar(20), catgy varchar(20));";
		stat.execute(sql);
	List<Order> ordl = new ArrayList<>();
	
    ordl.add(new Order(101,"Laptop",55000,03,2010,"erode","electronic",1));
    ordl.add(new Order(102,"SmartPhone",18000,12,2014,"salem","electronic",4));
    ordl.add(new Order(103,"Shoe",2000,01,2020,"chennai","accessories",6));
    ordl.add(new Order(104,"Pillow",500,05,2020,"coimbatore","accessories",10));
    ordl.add(new Order(105,"Watch",2500,02,2013,"erode","accessories",4));
    ordl.add(new Order(106,"Noddles",50,01,2019,"salem","food",2));
    ordl.add(new Order(107,"Gaming Mouse",1200,03,2024,"erode","electronic",1));
    ordl.add(new Order(108,"Braclet",100,10,2000,"namakkal","accessories",3));
    ordl.add(new Order(109,"Notebook",65,02,2018,"trichy","sationary",8));
    ordl.add(new Order(110,"Crayons",35,11,2000,"erode","sationary",1));
    
}
}
