package com.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Account {

	private String accId;
	private String accName;
	private String branch;

	public Account() {
		System.out.println("Account() constructor called");
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
