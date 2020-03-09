package com.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements  InitializingBean, DisposableBean{

	public Bean() {
		System.out.println("Bean constructor");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean: afterPropertiesSet() called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean : destroy() called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	
	
}
