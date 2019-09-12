package com.sakhaweb.service;

import com.sakhaweb.dao.signupdao;

public class signupService {
	public boolean isvalidate(String uname, String password,String confirmpassword) throws Exception {
		if(password.equals(confirmpassword)) {
			signupdao sd=new signupdao();
			return sd.setdata(uname,password);
		}
		else {
			return false;
		}
	}

}
