package com.mla;
import java.util.*;

public class Emp6 {
	public static void main(String[] sri) {
		
		//Collection data = new HashSet();
		//Set data = new HashSet();
		HashSet data = new HashSet();
		data.add("JAVA");
		data.add("hello");
		data.add(12540);
		data.add(true);
		data.add("JAVA");
		data.add(545446546414786464l);
		data.add(false);
		data.add('K');
		System.out.println(data);
	
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		data.forEach(x->System.out.println(x));
		
		
		
	}
}
