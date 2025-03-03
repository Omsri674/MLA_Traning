package com.mla;

import java.util.*;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int sal;

	public Employee() {

	}

	public Employee(int id, String n, int s) {
		this.id = id;
		this.name = n;
		this.sal = s;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public String getName() {
		return name;

	}

	public int getSal() {
		return sal;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}
	
}

public class Emp4 {

	public static void main(String[] sri) {

		List<Employee> Elist = new ArrayList<>();

		Elist.add(new Employee(3078, "Arun", 35000));
		Elist.add(new Employee(2045, "Bala", 75000));
		Elist.add(new Employee(1430, "Mohan", 15000));
		Elist.add(new Employee(6740, "Suresh", 85000));

		Iterator<Employee> itr = Elist.iterator();
		
		System.out.println("Before sorting the data");
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
			
		}
		
		Collections.sort(Elist);
		
		System.out.println("After sorting data using Employee Id:");
		
		for(Employee e : Elist) {
			System.out.println(e.toString());
		}
		
	//	System.out.println(Elist.getFirst().compareTo(Elist.getLast()));
		
		
		Collections.sort(Elist, new NameComparator());
		System.out.println("After sorting data with the name");
		
		for(Employee e : Elist) {
			System.out.println(e.toString());
		}
		
	}

}
