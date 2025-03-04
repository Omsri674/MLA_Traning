package com.mla;

import java.util.Map.*;
import java.util.*;

public class Emp9 {
public static void main(String[] sri) {
	
	//Map data = new HashMap();
	LinkedHashMap data = new LinkedHashMap();
	data.put(102, "java");
	data.put(105, "helo");
	data.put(106, "sri");
	data.put(104, "eswar");
	data.put(102, "mphasis");
	
	System.out.println(data);
	
	Iterator<Entry> itr = data.entrySet().iterator();
	while(itr.hasNext()) {
		Entry et = itr.next();
		System.out.println( et.getKey()+" "+et.getValue());
	}
	
	
	
//TREEMAP 
	TreeMap<String,Integer> data2 = new TreeMap();
	data2.put("TVS", 520);
	data2.put("Royal Enfield", 520);
	data2.put("Bajaj", 789);
	data2.put("Yamaha", 789);
	data2.put("Jawa", 456);
	data2.put("BMW", 720);	
	data2.put("Royal Enfield", 963);
	data2.put("BMW", 852);	

// using for each with the Key 
	for(String k : data2.keySet()) {
		System.out.println(k+"-->"+data2.get(k));
	}
	
//using for each for printing only values
	for(Integer i : data2.values()) {
		System.out.println(i);
	}
	System.out.println();
	
// using stream() (java 8 new feature)
	data2.forEach((k,v)->System.out.println(k+" "+v));
}
}
