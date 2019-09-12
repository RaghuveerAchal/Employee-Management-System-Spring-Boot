package com.sakha.configuration;

import java.util.Properties;

import org.hibernate.Hibernate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mchange.v2.c3p0.DriverManagerDataSource;
import com.sakha.model.Employee;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.sakha")
public class WebConfig {
	@Bean
	public DriverManagerDataSource dbsource() {
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClass("com.mysql.jdbc.Driver");
		db.setJdbcUrl("jdbc:mysql://localhost/ems1");
		db.setUser("sakha-lenovo-1");
		db.setPassword("welcome");
		
		return db;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
	
		
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(dbsource());
		Properties hbProperties = new Properties();
		
		hbProperties.put("hibernate.show_sql",true);
		hbProperties.put("hibernate.hbm2ddl.auto","update");
		hbProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		sf.setHibernateProperties(hbProperties);
		sf.setAnnotatedClasses(Employee.class);
		return sf;
		
	}
	@Bean
	public HibernateTransactionManager hbtransactionmanager() {
		HibernateTransactionManager hbt = new HibernateTransactionManager();
		hbt.setSessionFactory(getSessionFactory().getObject());
		return hbt;
	}

}
