package com.sakhaweb;

import java.util.Arrays;

import javax.servlet.annotation.WebServlet;

public class User {

	String name;
	String email;
	long phone;
	String address;
	String gender;
	String country;
	String []langs;
	public User(String name, String email, long phone, String address, String gender, String country, String[] langs) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.country = country;
		this.langs = langs;
	}
	
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", gender="
				+ gender + ", country=" + country + ", langs=" + Arrays.toString(langs) + "]";
	
	}
	
	
	
	
	
}