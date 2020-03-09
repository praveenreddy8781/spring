package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Autowired : annotation to a field or method that expects an array of that type:

@Component
public class Employee6 {

	@Autowired
	private Address[] address;
	
	public Employee6() {
		System.out.println("Employee6() constructor:::");
	}
	
	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		System.out.println("setAddress(Address[] address)::: injection " + address);
		this.address = address;
	}
}
