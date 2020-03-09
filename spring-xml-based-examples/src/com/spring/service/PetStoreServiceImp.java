package com.spring.service;

import com.spring.dao.JpaAccountDao;

public class PetStoreServiceImp {

	private int years;
	
	private JpaAccountDao accountDAO;
	
	private ClientSeervice clientSeervice;
	
	public ClientSeervice getClientSeervice() {
		return clientSeervice;
	}

	public void setClientSeervice(ClientSeervice clientSeervice) {
		System.out.println("setClientSeervice called");
		this.clientSeervice = clientSeervice;
	}

	public JpaAccountDao getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(JpaAccountDao accountDAO) {
		this.accountDAO = accountDAO;
	}

	public PetStoreServiceImp() {
		System.out.println("PetStoreServiceImp constructor");
	}
	
	
	public PetStoreServiceImp(JpaAccountDao accountDAO) {
		System.out.println("PetStoreServiceImp constructor::::" + accountDAO);
	}
	
	public PetStoreServiceImp(int years, String ultimateAns) {
		this.years = years;
		System.out.println("PetStoreServiceImp constructor::::ultimateAns:: " + ultimateAns + " years: " + years);
	}
	
	public void save() {
		System.out.println("PetStoreServiceImp save()");
		accountDAO.save();
	}

	public void get() {
		accountDAO.get();
	}

	public void update() {
		accountDAO.update();
	}

	public void delete() {
		accountDAO.delete();
	}
}
