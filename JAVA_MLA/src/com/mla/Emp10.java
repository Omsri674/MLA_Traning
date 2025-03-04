package com.mla;

import java.util.*;
import java.util.Objects;

class Customer{
	private int id;
	private String name;
	private String city;
	private int age;
	
	
	public Customer(){
		
	}


	public Customer(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, city, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
	
	
	
}

public class Emp10 {
	public static void main(String[] sri) {
		
		HashMap<Customer, String> data = new HashMap(); 
		data.put(new Customer(105,"Eswar","Erode",21),"1st customer");
		data.put(new Customer(109,"Kohil","Bangalore",30),"2st customer");
		data.put(new Customer(104,"Dhoni","Chennai",45),"3st customer");
		data.put(new Customer(103,"Jadu","Chennai",29),"4st customer");
		data.put(new Customer(117,"Nattu","Nagarkovil",25),"5st customer");
		data.put(new Customer(101,"Rutu","Rajastan",23),"6st customer");
		
		data.forEach((k,v)->System.out.println(k+" "+v));
		
	}
}
