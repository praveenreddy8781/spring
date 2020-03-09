package com.spring.bean;

public class ExampleBean {

	private String name;

	private String email;
	
	public ExampleBean() {
		System.out.println("ExampleBean constructor called::");
	}

	public ExampleBean(String name, String email) {
		System.out.println("ExampleBean constructor called::" + name + " " + email);
		this.name = name;
		this.email = email;
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
		this.email = email;
	}

	@Override
	public String toString() {
		return "ExampleBean [name=" + name + ", email=" + email + "]";
	}

}
