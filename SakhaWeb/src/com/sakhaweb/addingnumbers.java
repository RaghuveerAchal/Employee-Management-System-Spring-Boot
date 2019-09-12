package com.sakhaweb;

import javax.servlet.annotation.WebServlet;
public class addingnumbers {
	public int num1;
	public int num2;
	public int res = 0;
	public String res1;
	
	public addingnumbers(int num1,int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;

		
	}
	
	public String toString() {

		res = num1+num2;
		res1 = Integer.toString(res);
		return res1;
	}
}
