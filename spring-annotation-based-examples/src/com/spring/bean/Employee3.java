package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employeeBean3")
public class Employee3 {

	private Address address;

	public Employee3() {
		System.out.println("Employee3() constructor:::");
	}
	
	public Employee3(Address address) {
		this.address = address;
		System.out.println("Employee3(Address address) constructor::: injection" + address);
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)::: injection " + address);
		this.address = address;
	}

}
