package com.mla;

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