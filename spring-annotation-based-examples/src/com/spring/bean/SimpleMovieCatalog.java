package com.spring.bean;

public class SimpleMovieCatalog {
	private Integer catalogId;

	public SimpleMovieCatalog() {
		System.out.println("SimpleMovieCatalog() constructor called");
	}

	public Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	@Override
	public String toString() {
		return "SimpleMovieCatalog [catalogId=" + catalogId + "]";
	}

}
