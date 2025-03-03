package com.mla_tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Streamm {

	public static void main(String[] sri) {
		List<Employee> EmpList = new ArrayList<>();
		
		EmpList.add(new Employee(302,"Ben Tennyson",15,"male",2024,85000));
		EmpList.add(new Employee(421,"Gwen Tennyson",13,"female",2025,750000));
		EmpList.add(new Employee(375,"Maxx Tennyson",55,"male",2009,150000));
		EmpList.add(new Employee(542,"Kay Tennyson",15,"female",2016,95000));
		EmpList.add(new Employee(276,"Ken Tennyson",10,"male",2034,10000));
		EmpList.add(new Employee(198,"Kevin Eleven",20,"male",2010,65000));
		EmpList.add(new Employee(774,"Rook",30,"male",2020,45000));
		EmpList.add(new Employee(665,"Azumth",99,"male",1999,90000));
		EmpList.add(new Employee(391,"Vilgax",10,"female",2056,14000));
		EmpList.add(new Employee(369,"Albedo",98,"male",2001,1000));
		EmpList.add(new Employee(258,"Cooper",25,"male",2027,15000));
		EmpList.add(new Employee(147,"julei",14,"female",2002,5600));
		EmpList.add(new Employee(665,"Azumth",99,"male",1999,90000));
		EmpList.add(new Employee(391,"Vilgax",10,"female",2056,14000));
		EmpList.add(new Employee(369,"Albedo",98,"male",2001,1000));
		EmpList.add(new Employee(302,"Ben Tennyson",15,"male",2024,85000));
		EmpList.add(new Employee(421,"Gwen Tennyson",13,"female",2025,750000));
			
		System.out.println("Entries as per the insertion order:");
		EmpList.forEach(emp -> System.out.println(emp.toString()));
		System.out.println("\n \nEntries as per the filter method (Employee Name ending with Tennyson):");

		
// filtering the employees with name ends with TENNYSON.
		EmpList.stream().filter(emp -> emp.getName().endsWith("Tennyson"))
		.forEach(e -> System.out.println(e.toString()));
		
		
//filtering the employees joined after 2020 and storing in a list as well as sorted by their age
		System.out.println("\n \nEntries as per the filter method (Employee joinned after 2020) :");

		List<Employee> eList =  EmpList.stream()
				.filter(emp ->emp.getYOJ() > 2020)
		.sorted(Comparator.comparing(Employee :: getAge))
		.collect(Collectors.toList());
		
		
		System.out.println("\n \nEntries as per the sorted method");

		eList.forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println("\n \nDistinct employee name");
		List<String> names =  EmpList.stream().filter(emp -> !emp.getName().isEmpty()).map(e -> e.getName()).toList();
		
		names.stream().distinct().forEach(emp -> System.out.println(emp));
		
		
		System.out.println("\n \nDuplicate employee name count");
		int dup_count = (int) (names.stream().count() - names.stream().distinct().count());
		System.out.println(dup_count);

		

		

		
	}
	
}
