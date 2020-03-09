package com.spring.bean;

public class InstituteBean {
	private String name;
	private ManagerBean managerBean;

	public InstituteBean() {
		System.out.println("InstituteBean constructor::");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ManagerBean getManagerBean() {
		return managerBean;
	}

	public void setManagerBean(ManagerBean managerBean) {
		this.managerBean = managerBean;
	}

	@Override
	public String toString() {
		return "InstituteBean [name=" + name + ", managerBean=" + managerBean + "]";
	}

}
