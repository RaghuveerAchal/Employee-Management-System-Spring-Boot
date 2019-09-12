package com.sakhaweb.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class regdao {
	
	public boolean checkreg(String user, String pass,String confirmpass)throws Exception {
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/login","sakha-lenovo-1","welcome");
		String uname = user;
		String password = pass;
		String confirmpassword = confirmpass;
		PreparedStatement pr = con.prepareStatement("Insert into login values (?,?)");
		pr.setString(1,uname);
		pr.setString(2, pass);
		
		if(password==confirmpass) {
			pr.execute();
		
			return true;
		}
		else {
			System.out.println("fail");
			return false;
		}
		
		
	}

}
