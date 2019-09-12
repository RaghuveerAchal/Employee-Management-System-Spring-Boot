package com.sakhaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userdao {
	
	public boolean getData(String user,String password)throws Exception{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login","sakha-lenovo-1","welcome");
	
		PreparedStatement pr = con.prepareStatement("select * from userdata where username = ? and password = ?");
		pr.setString(1, user);
		pr.setString(2, password);
		ResultSet rs=pr.executeQuery();
		if(rs.next())
		{
			return true;
		}
		else
			return false;
		
		
	
	}

}
