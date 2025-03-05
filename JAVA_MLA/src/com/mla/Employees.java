package com.mla;

import java.util.Objects;

public class Employees {

	
	private int id;
	private String name;
	private String gender;
	private String dept;
	private int YOJ;
	private int sal;
	
	public Employees() {
		
	}
	
	public Employees(int id, String name, String gender, String dept, int yOJ, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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
		return "Employees [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", YOJ=" + YOJ
				+ ", sal=" + sal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(YOJ, dept, gender, id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return YOJ == other.YOJ && Objects.equals(dept, other.dept) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(name, other.name) && sal == other.sal;
	}
	
	
	
	
}
