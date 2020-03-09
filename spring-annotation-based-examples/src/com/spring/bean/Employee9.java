package com.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@PostConstruct and @PreDestroy example

@Component
public class Employee9 {

	public Employee9() {
		System.out.println("Employee9() constructor:::");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct() called");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy() called");
	}
}
