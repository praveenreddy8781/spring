package com.spring.service;

public class ClientSeervice {

	private static ClientSeervice clientSeervice = new ClientSeervice();

	public ClientSeervice() {
		System.out.println("ClientSeervice constructor");
	}

	public static ClientSeervice createInstance() {
		System.out.println("ClientSeervice: createInstance static factory method");
		return clientSeervice;
	}
	
	public ClientSeervice createClientServiceInstance() {
		System.out.println("ClientSeervice: createClientServiceInstance() instance method");
		return clientSeervice;
	}
}
