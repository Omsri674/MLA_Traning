package com.mla_tasks;

public class Employee implements Comparable<Employee>
{

	private int id;
	private String name;
	private int age;
	private String gender;
	private int YOJ;
	private int sal;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age, String gender, int yOJ, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		YOJ = yOJ;
		this.sal = sal;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYOJ() {
		return YOJ;
	}
	public void setYOJ(int yOJ) {
		YOJ = yOJ;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", YOJ=" + YOJ
				+ ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
}
