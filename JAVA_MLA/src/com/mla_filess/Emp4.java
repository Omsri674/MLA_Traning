package com.mla_filess;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Emp4 {

	public static void main(String[] args) {
		
		
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		ObjectInputStream objin = null;
		try {
			
			fin = new FileInputStream("src/employee.txt");
			
			bin = new BufferedInputStream(fin);
			objin = new ObjectInputStream(bin);
			Employee emp = (Employee) objin.readObject();
			System.out.println(emp.getId()+" "+emp.getName()+" "+
			emp.getAge());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				objin.close();
				bin.close();
				fin.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
