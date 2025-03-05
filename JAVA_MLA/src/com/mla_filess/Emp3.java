package com.mla_filess;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Emp3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = sc.nextInt();

		System.out.println("enter name");
		String name = sc.next();
		
		System.out.println("enter age");
		int age = sc.nextInt();
		
		Employee empObj = new Employee(id,name,age);
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream objout = null;
		
		
		try {
			
			fout = new FileOutputStream("src/employee.txt");
			bout = new BufferedOutputStream(fout);
			objout = new ObjectOutputStream(bout);
			objout.writeObject(empObj);
			System.out.println("Done...");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				objout.close();
				bout.close();
				fout.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
