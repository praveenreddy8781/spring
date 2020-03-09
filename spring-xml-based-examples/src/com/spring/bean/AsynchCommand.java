package com.spring.bean;

public class AsynchCommand {

	public AsynchCommand() {
		System.out.println("AynchCommand() Constructor");
	}
	
	public String execute(Object someObj) {
		System.out.println("AsynchCommand: execute() called");
		return "completed";
	}
}
