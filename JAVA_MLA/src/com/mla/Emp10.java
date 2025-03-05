package com.mla;

import java.util.*;
import java.util.Objects;



public class Emp10 {
	public static void main(String[] sri) {
		
		HashMap<Customer, String> data = new HashMap(); 
		data.put(new Customer(105,"Eswar","Erode",21),"1st customer");
		data.put(new Customer(109,"Kohil","Bangalore",30),"2st customer");
		data.put(new Customer(104,"Dhoni","Chennai",45),"3st customer");
		data.put(new Customer(103,"Jadu","Chennai",29),"4st customer");
		data.put(new Customer(117,"Nattu","Nagarkovil",25),"5st customer");
		data.put(new Customer(101,"Rutu","Rajastan",23),"6st customer");
		
		data.forEach((k,v)->System.out.println(k+" "+v));
		
	}
}
