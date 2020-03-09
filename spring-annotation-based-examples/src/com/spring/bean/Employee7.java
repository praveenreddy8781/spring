package com.spring.bean;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Autowired : annotation to a field or method that expects collection:

@Component
public class Employee7 {

	private Set<Address> address;

	public Employee7() {
		System.out.println("Employee7() constructor:::");
	}

	public Set<Address> getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Set<Address> address) {
		System.out.println("setAddress(Set<Address> address)::: injection " + address);
		this.address = address;
	}
}
