package com.spring.bean;

public class Employee {

	private Address address;

	public Employee() {
		System.out.println("Employee() constructor:::");
	}
	
	public Employee(Address address) {
		this.address = address;
		System.out.println("Employee(Address address) constructor:::");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)::: ");
		this.address = address;
	}

}
