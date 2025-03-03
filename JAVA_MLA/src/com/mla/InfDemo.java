package com.mla;


interface Inf1{
	void animal();
	void human();
}

interface Inf2{
	void dog();
	void cat();
}

interface Inf3{
	void book();
	void note();
}

interface InfMain extends Inf1, Inf2, Inf3{
	void run();
}

class Imple implements InfMain{
	public void animal() {
		System.out.println("animal is overrided");
	}

	@Override
	public void human() {
		// TODO Auto-generated method stub
		System.out.println("human is overrided");
		
	}

	@Override
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("dog is overrided");
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("cat is overrided");
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		System.out.println("book is overrided");
	}

	@Override
	public void note() {
		// TODO Auto-generated method stub
		System.out.println("note is overrided");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run is overrided");		
	}
	
	
}

public class InfDemo {

	public static void main(String[] args) {
		
		Imple obj = new Imple();
		
		obj.human();
		obj.animal();
		obj.book();
		obj.note();
		obj.dog();
		obj.cat();
		obj.run();
		
	}
}
