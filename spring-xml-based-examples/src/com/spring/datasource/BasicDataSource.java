package com.spring.datasource;

import java.net.URL;

public class BasicDataSource {

	private String driverClass;
	private URL url;
	private String userName;
	private String password;

	public BasicDataSource() {
		System.out.println("BasicDataSource constructor");
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "BasicDataSource [driverClass=" + driverClass + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}
}
