package com.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {

	public Bean2() {
		System.out.println("Bean2 constructor()");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct method called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy method called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
}
