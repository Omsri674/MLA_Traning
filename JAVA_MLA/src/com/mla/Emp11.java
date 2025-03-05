package com.mla;

import java.util.List;
import java.util.Map.Entry;
import java.util.*;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

	
	

public class Emp11 {

	public static void main(String[] sri) {
		Map<String, List<Books>> bookData = new HashMap();
		
		List<Books> soft_b = new ArrayList<>();
		soft_b.add(new Books(101,"java","java author"));
		soft_b.add(new Books(102,"C","C author"));
		soft_b.add(new Books(103,"C++","C++ author"));
		soft_b.add(new Books(104,"Pyhton","Pyhton author"));
		
		List<Books> ece_b = new ArrayList<>();
		ece_b.add(new Books(201,"Compactor","Compactor author"));
		ece_b.add(new Books(202,"Capacitor","Capacitor author"));
		ece_b.add(new Books(203,"MicroController","MicroController author"));
		ece_b.add(new Books(204,"IC","IC author"));
		
		List<Books> lang_b = new ArrayList<>();
		lang_b.add(new Books(301,"Tamil","Tamil author"));
		lang_b.add(new Books(302,"English","English author"));
		lang_b.add(new Books(303,"Malayalam","Malayalam author"));
		lang_b.add(new Books(304,"Telungu","Telungu author"));
		
		bookData.put("Software", soft_b);
		bookData.put("ECE", ece_b);
		bookData.put("Language", lang_b);
		
		Iterator<Entry<String,List<Books>>> itr = bookData.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String,List<Books>> et = itr.next();
			System.out.println("Department : "+et.getKey());
			et.getValue().forEach(b->System.out.println(b.toString()));
			System.out.println();
		}
		
		bookData.forEach((k,v)->System.out.println(k+" "+ v));
		
		
		
		
		
		/*
		 * 1. add the data
		 * 2. find out count of male and female emp 
		 * 3. to print the name of all dept 
		 * 4. find the avg age of male and female
		 * 5. list of emp name who joined after 2020
		 * 6. count no. of emp from each dept
		 * 7. find the avg sal of each dept
		 * 8. oldest employee, his age and dept
		 * 9. find avg and total sal of all emp
		 * 10. list down the employee from each dept
		 * 11. find the highest exp
		 * 
		*/	
		
		
		
			
			List<Employees> Emplist = new ArrayList<>();
			Emplist.add(new Employees(101,"Stuward Little","male","ADMIN",2000,25000));
			Emplist.add(new Employees(102,"George Mattew","male","ADMIN",2026,35000));
			Emplist.add(new Employees(103,"Chris Hemisworth","male","ADMIN",2011,45000));
			Emplist.add(new Employees(201,"Cris Evans","male","IT",2016,65000));
			Emplist.add(new Employees(202,"Free guy","male","IT",2015,75000));
			Emplist.add(new Employees(203,"Roddy","male","IT",2010,17000));
			Emplist.add(new Employees(301,"Natasha","female","CSRO",2009,30000));
			Emplist.add(new Employees(302,"Chadwick","male","CSRO",2004,95000));
			Emplist.add(new Employees(303,"Riya Kannan ","female","CSRO",2002,10000));
			Emplist.add(new Employees(001,"Tony Strack","male","CEO",2000,1500000));
			System.out.println();
			Emp11.getCount(Emplist);
			System.out.println();

			Emp11.getListofDept(Emplist);
			Emp11.getAvg(Emplist);
			Emp11.getName(Emplist);
			System.out.println();
			Emp11.countEmp(Emplist);
			System.out.println();
			Emp11.AvgSal(Emplist);
			System.out.println();
			Emp11.OldEmp(Emplist);
			System.out.println();
			Emp11.TotSal(Emplist);
			System.out.println();
			Emp11.ListOfEmp(Emplist);
			System.out.println();
			Emp11.MaxExp(Emplist);

			
			
	}
	
	
	public static void getCount(List<Employees> empl) {
		
		Map<String, Long> res = empl.stream()
				.collect(Collectors.groupingBy(Employees :: getGender,
				Collectors.counting()));
		
		
		res.forEach((k,v)-> System.out.println(k+" "+v));
	
		
	}
	public static void getListofDept(List<Employees> empl) {
		empl.stream().map(Employees :: getDept).distinct().forEach(d -> System.out.println(d));
	}
	
	public  static void getAvg(List<Employees> empl) {
		Map<String, Double> res = empl.stream()
				.collect(Collectors.groupingBy(Employees :: getGender,
						Collectors.averagingInt(Employees :: getYOJ)));
		
		System.out.println(res);
	}
	
	public static void getName(List<Employees> empl) {
		
		empl.stream().filter(e->e.getYOJ() > 2020).forEach(System.out :: println);;
	}
	
	public static void countEmp(List<Employees> empl) {
		Map<String,Long> res = empl.stream().collect(Collectors.groupingBy(Employees :: getDept,
				Collectors.counting()));
		
		res.forEach((k,v)-> System.out.println(k+" "+v));
		
	}
	
	public static void AvgSal(List<Employees> empl) {
		Map<String,Double> res = empl.stream().collect(Collectors.groupingBy(Employees :: getDept,
				Collectors.averagingDouble(Employees :: getSal)));
		res.forEach((k,v)-> System.out.println(k+" "+v));
	}

	
	public static void OldEmp(List<Employees> empl) {
		Optional<Employees> old = empl.stream().min(Comparator.comparing(Employees :: getYOJ));
		Employees em = old.get();
		System.out.println(em.getDept()+" "+em.getYOJ());
	}
	
	public static void TotSal(List<Employees> empl) {
		DoubleSummaryStatistics res = 
				empl.stream().collect(Collectors.summarizingDouble(Employees :: getSal));
		System.out.println("AVG: "+res.getAverage());
		System.out.println("SUM: "+res.getSum());
		
	}
	
	public static void ListOfEmp(List<Employees> empl) {
		
		Map<String,List<Employees>> empM = 
				empl.stream().collect(Collectors.groupingBy(Employees :: getDept));
		
		for(String s : empM.keySet()) {
			System.out.println("Department: "+s);
			System.out.println(empM.get(s));
		}
			
				
	}
	
	public static void MaxExp(List<Employees> empl) {
		Optional<Employees> maxe = empl.stream().
				sorted(Comparator.comparing(Employees :: getYOJ)).findFirst();
		Employees sen = maxe.get();
		System.out.println(sen.toString());
		
	}
	
}
