package com.mla;

import java.util.TreeSet;

public class Emp7 {

	
	public static void main(String[] sri) {
		//Collection data = new TreeSet();
		//Set data = new TreeSet();
		TreeSet data = new TreeSet();
		data.add("JAVA");
		data.add("hello");
		data.add("eswar");
		data.add("bike");
		data.add("code");
		data.add("JAVA");
		data.add("bike");
		data.add("sri");
		data.add("Args");
		System.out.println(data);
//subaSet()
		System.out.println(data.subSet("bike","sri"));
		
		System.out.println(data.pollFirst());
		System.out.println(data.reversed());
	}
}
