package com.mla;

import java.util.List;
import java.util.Map.Entry;
import java.util.*;
import java.util.Objects;

class Books{
	private int id;
	private String name;
	private String auth;
	
	public Books() {
		
	}

	public Books(int id, String name, String auth) {
		super();
		this.id = id;
		this.name = name;
		this.auth = auth;
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

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", auth=" + auth + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(auth, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(auth, other.auth) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}
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
	}
	
}
