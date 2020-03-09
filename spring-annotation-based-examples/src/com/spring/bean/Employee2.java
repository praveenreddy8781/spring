package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employeeBean2")
public class Employee2 {

	private Address address;

	public Employee2() {
		System.out.println("Employee2() constructor:::");
	}
	
	@Autowired
	public Employee2(Address address) {
		this.address = address;
		System.out.println("Employee2(Address address) constructor::: injection" + address);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)::: ");
		this.address = address;
	}

}
