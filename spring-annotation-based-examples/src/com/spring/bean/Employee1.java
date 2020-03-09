package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("employeeBean1")
public class Employee1 {

	private Address address;

	public Employee1() {
		System.out.println("Employee1() constructor:::");
	}
	
	public Employee1(Address address) {
		this.address = address;
		System.out.println("Employee1(Address address) constructor:::" + address);
	}

	public Address getAddress() {
		return address;
	}

	@Required
	@Autowired
	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)::: ");
		this.address = address;
	}

}
