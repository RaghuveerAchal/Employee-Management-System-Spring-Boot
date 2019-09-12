package com.ems.config;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ems.application.EmployeeManagementApp;
import com.ems.dao.EmployeeDaoImpl;
import com.ems.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.ems")
public class AppConfig {
	
	
	@Bean("con")
	public Connection getConnection() throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","sakha-lenovo-1","welcome");
		
		return con;
	}
	

	@Bean("dao")
	public EmployeeDaoImpl getEmpDao(){
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		return dao;
	}
	@Bean("es")
	public EmployeeServiceImpl getEmpService() {
		EmployeeServiceImpl es = new EmployeeServiceImpl();
		es.setDao(getEmpDao());
		return es;
	}
	

	@Bean("app")
	public EmployeeManagementApp getApp() {
		EmployeeManagementApp app= new EmployeeManagementApp();
		app.setEs(getEmpService());
		return app;
	}

}
