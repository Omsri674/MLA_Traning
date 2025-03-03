package com.mla;

import java.util.*;

public class Exp1 {
	public static void main(String[] sri) {
		//Collection data  = new ArrayList();
		// List datta = new ArrayList();
		ArrayList data = new ArrayList();
		
		
		
// data added using add()
		data.add(25);
		data.add(35.798);
		data.add(454);
		data.add(365546465);
		data.add("hello");
		data.add(33343544645667l);
		data.add("eswar");
		data.add(22.33f);
		data.add("hello ");
		data.add(25);
		data.add(11.78d);
		System.out.println(data);
		System.out.println(data.size());
// data updated using set()
		data.set(9, 10101111);
		
		System.out.println(data);
// data removed using remove()
		data.remove(8);
		System.out.println(data);
// data location get by using get()
		System.out.println(data.get(6));
		
// checking data presence using contains method
		System.out.println(data.contains("eswar"));
		
// to print exact 1st and last value using default method
		System.out.println(data.getFirst() +" "+data.getLast());
		
		System.out.println();
//Using iterator 
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
// ListIterator
		ListIterator ltr = data.listIterator();
		
		while(ltr.hasNext()) {
			System.out.println(ltr.next());

		}
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());

		}
		
		
// LinkedList 
		LinkedList ldata = new LinkedList();
		ldata.add(2564);
		ldata.add(false);
		ldata.add(12);
		ldata.add(3124646461357681l);
		ldata.add("Omsri");
		ldata.add("ESWAR");
		ldata.add("JAVA");
		ldata.add("PULSAR");
		ldata.add(2564);
		ldata.add(true);
		ldata.add(6546.654f);
		ldata.add(485846846876.21d);
		ldata.add('K');
		
		System.out.println(data);
		System.out.println();
		System.out.println();
		ListIterator ltr2 = ldata.listIterator();
		while(ltr2.hasNext()) {
			System.out.println(ltr2.next());
		}
		
	}
}
