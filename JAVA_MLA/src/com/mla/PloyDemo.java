package com.mla;
class Parent{
	public void draw() {
		System.out.println("DRAW AS PER PARENT SIGNATURE");
	}
}

class Child1 extends Parent{
	@Override
	public void draw() {
		System.out.println("DRAW AS PER CHILD1 SIGNATURE");
	}
}


class Child2 extends Parent{
	@Override
	public void draw() {
		System.out.println("DRAW AS PER CHILD2 SIGNATURE");
	}
}

public class PloyDemo {

	Parent obj1 = new Child1();
	Parent obj2  = new Child2();
	obj1.draw();
	obj2.draw();
}
