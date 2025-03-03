package com.mla;

 class A {
	int id = 737754;
	String name = "Eswar";
	public  void Show() {
		System.out.println("ID : "+ id +" NAME : "+ name);
	}
	
	public void method1() {
		System.out.println("PArent class method");	
		
	}
}


class B extends A{
	String city ="Erode";
	public  void Disp() {
		System.out.println("ID : "+id+" NAME : "+name +" CITY : "+city);
	}

	public void method2() {
		
		System.out.println("IMMEDIATE CHILD  class method");	
		
	}

}

class C extends B{
public void method3() {
		
		System.out.println("last CHILD  class method");	
		
	}
}




public class InhertiDemo{
	public static void main(String[] sri) {
		B obj = new B();
		obj.Show();
		obj.Disp();
		
		C obj_c = new C();
		A obj_a = obj_c;
		
//		A objA = new A();
//		C objC = objA;
	                  
	}
	
}