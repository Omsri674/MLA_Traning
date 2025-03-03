package com.mla;

import java.util.Enumeration;
import java.util.Stack;

public class Emp2 {
	public static void main(String[] sri) {
		Stack  stk  = new Stack();
		
		stk.add(10);
		stk.add(false);
		stk.add(true);
		stk.add(24564546846465l);
		stk.add("kavi");
		stk.add("eswar");
		stk.add(1452);
		System.out.println(stk);
// pop()
		stk.pop();
		System.out.println(stk);
		
//peek()
		System.out.println(stk.peek());
		
//search() if present returns the index if not returns -1
		System.out.println(stk.search("kavi"));
		
//empty() return true if the stack is empty if not false;
		System.out.println(stk.empty());
		
// clear() to remove compelete entire data from the object but the object remains same 
		stk.clear();
		System.out.println(stk);
		stk.add(10);
		stk.add(false);
		stk.add(true);
		stk.add(24564546846465l);
		stk.add("kavi");
		stk.add("eswar");
		stk.add(1452);
	//enumeraton for iteration
		Enumeration itr = stk.elements();
		
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}
	}
}
