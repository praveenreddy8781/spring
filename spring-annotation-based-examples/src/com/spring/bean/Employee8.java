package com.spring.bean;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

//@Resource: JSR-250

@Component
public class Employee8 {

//	@Resource // can be used
	private Address address;

	public Employee8() {
		System.out.println("Employee8() constructor:::");
	}

//	@Resource //cant be used on constructor
	public Employee8(Address address) {
		System.out.println("Employee8() constructor:::" + address);
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	@Resource
	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)::: injection " + address);
		this.address = address;
	}
}
