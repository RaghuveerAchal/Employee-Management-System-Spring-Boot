package com.sakhaweb.service;

import com.sakhaweb.dao.userdao;

public class userservice {
	
	public boolean isvalidate(String uname,String pass) throws Exception
	{
		
		if(uname==""||pass=="")
		{
			return false;
		}
		else {
		userdao ud=new userdao();
		return ud.getData(uname, pass);
		}
		
	}

}
