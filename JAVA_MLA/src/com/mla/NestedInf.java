package com.mla;
import java.util.*;
import java.util.regex.Pattern;
import java.regex.*;
interface Inf9{
	void add();
	
	interface Inf10{
		void mul();
//		void 
	}
}

class Imple7 implements Inf9{
	public void add() {
		System.out.println("add is overrided");
	}
}
class Imp7 implements Inf9.Inf10{

//	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul is overrided");

	}
	
}
class Stud{
	private int id;
	private int reg;
	private String name;
	
	
	public Stud(int id, int reg, String name) {
		super();
		this.id = id;
		this.reg = reg;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", reg=" + reg + ", name=" + name ;
	}
	
	
}

public class NestedInf {
	
	public static void main(String[] sri) {
		
		Stud obj = new Stud(73345,45,"Tharun");
		Stud obj2 = new Stud(73316,02,"Abishek");
		Stud obj3 = new Stud(73325,23,"Eswar");
		Stud obj4 = new Stud(73143,35,"Kavi");
		System.out.println(obj.toString() +"\n" +obj2.toString() +" \n"+obj3.toString()+" \n"+obj4.toString());
		
		
		Integer[] arr = {1,28,256,48,324,1,15,15,78,25,69};
		List<Integer> list_arr = new ArrayList();
		list_arr = Arrays.asList(arr);
		Arrays.sort(arr);
		for(int e : arr) {
			System.out.print(e +" ");
			
		}
		System.out.println();
		int a = Arrays.binarySearch(arr, 48);
		
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println(a+"\n Count "+count);
		
		String str1 = "java";
		String str2 = "java";
		String str5 = "hello";
		String str3 = new String("java");
		String str4 = new String("java");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		
		str1 = str1.concat(" hello");
		System.out.println(str1);
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		
		String[] Sarr = "java hello this is string ".split(" ");
		for(int i=Sarr.length-1;i>=0;i--) {
			System.out.print(Sarr[i]+" ");
		}
		
	
	}
 
}
