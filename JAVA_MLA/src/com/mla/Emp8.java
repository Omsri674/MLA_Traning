package com.mla;

import java.util.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book>
{
	private int id;
	private String name;
	private String auth;
	private int price;
	
	public Book() {
		
	}
	
	public Book(int id, String name, String auth, int price) {
		
		this.id = id;
		this.name = name;
		this.auth = auth;
		this.price = price;
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


	public String getAuth() {
		return auth;
	}


	public void setAuth(String auth) {
		this.auth = auth;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auth=" + auth + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(auth, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(auth, other.auth) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}

	@Override
	public int compareTo(Book o) {
		
		return this.id - o.id;
	}
	
	

}

class NameComparator1 implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class Emp8 {
	
	public static void main(String[] sri) {
//		HashSet<Book> data = new HashSet<>();
		TreeSet<Book> data = new TreeSet<>(new NameComparator1());
		data.add(new Book(1022,"JAVA","JAVA DEVELOPER ",799));
		data.add(new Book(2045,"C","C DEVELOPER ",1234));
		data.add(new Book(1658,"PYTHON","PYTHON DEVELOPER ",520));
		data.add(new Book(6542,"COBALT","COBALT DEVELOPER ",765));
		data.add(new Book(1457,"FLUTTER","FLUTTER DEVELOPER ",950));
		
//		System.out.println(data);
//		data.forEach(b->System.out.println(b.toString()));
//		System.out.println();
//		data.parallelStream().filter(b->b.getPrice() >750).forEach(e->System.out.println(e.toString()));
		
		
		data.stream().sorted(Comparator.comparing(Book :: getName)).filter(b->b.getPrice() >=750 && b.getPrice() <=1000).forEach(x->System.out.println(x.toString()));
	}
	

}
