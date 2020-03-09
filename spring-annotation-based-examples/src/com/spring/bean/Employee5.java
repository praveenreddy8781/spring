package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Autowired : You can apply
//to fields as well and even mix it with constructors:

@Component
public class Employee5 {

	@Autowired
	private Address address;
	
	private Account account;

	public Employee5() {
		System.out.println("Employee5() constructor:::");
	}
	
	@Autowired
	public Employee5(Account account) {
		this.setAccount(account);
		System.out.println("Employee5(Account account) constructor::: injection" + account);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)::: injection " + address);
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
