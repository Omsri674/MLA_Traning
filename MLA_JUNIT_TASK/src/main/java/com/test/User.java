package com.test;

import java.util.Objects;

public class User {
	
	private int id;
	private String name;
	private String email;
	private int YOJ;
	private String city;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(email == null) {
			throw new IllegalArgumentException("email type pannu");
			
		}else {
			if(!email.contains("@gmail.com")) {
				throw new IllegalStateException("Check your email twice before type....");
				
			}else {
				this.email = email;
			}
		}
		
	}
	public int getYOJ() {
		return YOJ;
	}
	public void setYOJ(int yOJ) {
		YOJ = yOJ;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public User() {
		
	}
	public User(int id, String name, String email, int yOJ, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		YOJ = yOJ;
		this.city = city;
	}
	@Override
	public int hashCode() {
		return Objects.hash(YOJ, city, email, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return YOJ == other.YOJ && Objects.equals(city, other.city) && Objects.equals(email, other.email)
				&& id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	

}
