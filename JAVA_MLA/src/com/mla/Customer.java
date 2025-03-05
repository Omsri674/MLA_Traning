package com.mla;

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