package com.mla;

import java.util.*;
import java.util.stream.Collectors;

class Student //implements Comparable<Student>
{
	private int id;
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

//	public int compareTo(Student o) {
//				
//		return o.id-this.id;
//	}
}


public class Emp5 {
	
	public static void main(String[] sri) {
		
		List<Student> Slist = new ArrayList<>();
		
		Slist.add(new Student(37,"Bruce Banner",45));
		Slist.add(new Student(21,"Tony Stark",55));
		Slist.add(new Student(34,"Steve Roger",95));
		Slist.add(new Student(45,"Thor",1500));
		Slist.add(new Student(01,"Heimdol",120));
		Slist.add(new Student(56,"Peter Parker",20));	
		
		
		System.out.println("Before sorting the student data");
		
		Slist.forEach(stu -> System.out.println(stu.toString()));
// sorting using java 8 new Feature stream API
		
		
//		List<Student> frmtdata = Slist.stream()
//				.sorted(Comparator.comparing(Student :: getId)))
//				.collect(Collectors.toList());
		
		
		List<Student> frmtdata = Slist.stream()
				.sorted(Comparator.comparing(Student :: getName).reversed()
				.thenComparing(Student::getId))
				.collect(Collectors.toList());
		

		System.out.println("After sorting the student data");
		
		frmtdata.forEach(stu -> System.out.println(stu.toString()));
	
		System.out.println();
		
		
// using Stream API print names with filter method starts with characters
		
		Slist.stream()
		.filter(stu -> stu.getName().startsWith("T"))
		.forEach(s -> System.out.println(s.toString()));
		
		System.out.println();
// using stream API sorting the student data 
		
		Slist.stream()
		.sorted(Comparator.comparing(Student :: getName))
				.forEach(stu -> System.out.println(stu.toString()));
		
		System.out.println("Sorted by the age");
// create new list and store formatted data 
		List<Student> formattedData = Slist.parallelStream()
										.sorted(Comparator.comparing(Student :: getAge))
										.collect(Collectors.toList());
		formattedData.forEach(stu -> System.out.println(stu.toString()));
	}
	
	
}
