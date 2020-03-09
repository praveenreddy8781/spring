package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employeeBean4")
public class Employee4 {

	private Address address;

	public Employee4() {
		System.out.println("Employee4() constructor:::");
	}
	
	public Employee4(Address address) {
		this.address = address;
		System.out.println("Employee4(Address address) constructor::: injection" + address);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)::: injection " + address);
		this.address = address;
	}
	
	@Autowired
	public void inject(Address address) {
		this.address = address;
		System.out.println("inject(Address address):: through arbitary method " + address );
	}

}
