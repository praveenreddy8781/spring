package com.spring.bean;

public class ManagerBean {

	private String name;
	private String DeptName;

	public ManagerBean() {
		System.out.println("ManagerBean constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	@Override
	public String toString() {
		return "ManagerBean [name=" + name + ", DeptName=" + DeptName + "]";
	}

}
