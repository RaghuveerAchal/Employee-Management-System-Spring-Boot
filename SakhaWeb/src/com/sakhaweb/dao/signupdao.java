package com.sakhaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class signupdao {
	public boolean setdata(String uname,String password) throws Exception 
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login","sakha-lenovo-1","welcome");
		PreparedStatement pr=con.prepareStatement("insert into userdata values(?,?)");
		pr.setString(1, uname);
		pr.setString(2, password);
		int r=pr.executeUpdate();
		if(r>0)
			return true;
		else
			return false;
		
		
		
		
		
	}

}
