package com.spring.bean;

import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;

public class Bean4 implements LifecycleProcessor {

	public Bean4() {
		System.out.println("Bean4 constructor()");
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

//	below methods are from Lifecycle interface
	@Override
	public boolean isRunning() {
		System.out.println("isRunning() called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		return true;
	}

	@Override
	public void start() {
		System.out.println("start() called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	@Override
	public void stop() {
		System.out.println("stop() called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

//	below methods are from LifecycleProcessor interface
	@Override
	public void onClose() {
		System.out.println("onClose() called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	@Override
	public void onRefresh() {
		System.out.println("onRefresh() called");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	
}
