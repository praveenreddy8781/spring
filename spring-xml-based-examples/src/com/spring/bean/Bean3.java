package com.spring.bean;

public class Bean3 {

	public Bean3() {
		System.out.println("Bean3 constructor()");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	public void initMethod() {
		System.out.println("init-method called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	public void destroy() {
		System.out.println("destroy-method called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
}
