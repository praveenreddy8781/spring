package com.spring.bean;

import java.util.Properties;

public class CollectionMerge {

	private Properties properties;

	public CollectionMerge() {
		System.out.println("CollectionMerge constructor");
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionMerge [properties=" + properties + "]";
	}
}
