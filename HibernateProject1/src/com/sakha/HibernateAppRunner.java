package com.sakha;

import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;





public class HibernateAppRunner {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().addAnnotatedClass(Trainee.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
		
//		List<Laptop> LapList = new ArrayList();
		Session ssn=sf.openSession();
		Transaction tx=ssn.beginTransaction();
//		LapList.add(l2);
//		LapList.add(l3);
//		Laptop l1 = ssn.get(Laptop.class, 1);
//		LapList.add(l1);
//		Laptop l2 = ssn.get(Laptop.class, 2);
//		LapList.add(l2);
//		Laptop l3 = ssn.get(Laptop.class, 3);
//		LapList.add(l3);
		
		
//		Trainee t1 = new Trainee("rahul",25);
//		Trainee t2 = new Trainee("mohan",27);
//		t1.getLaptop().add(l1);
//		t1.getLaptop().add(l2);
//		t2.getLaptop().add(l1);
//		t2.getLaptop().add(l3);

//		l2.setTrainee(t1);
//		l3.setTrainee(t1);
//		l1.setTrainee(t1);
		int maxage = 24;
		Query qr = ssn.createQuery("from Trainee where tage<:age");
		Criteria cr= ssn.createCriteria(Trainee.class);
		qr.setParameter("age", maxage);
		
		
		int r = qr.executeUpdate();
		
		

		

		
		//		List<String> mobiles = Arrays.asList("Nokia","Iphone");
		
//		Session ssn=sf.openSession();
//		Transaction tx=ssn.beginTransaction();
//		Laptop l1 = ssn.get(Laptop.class, 1);
		

		
//		ssn.save(l2);
//		ssn.save(l3);
//		ssn.save(l1);
//		
//		ssn.save(t1);
//		ssn.save(t2);
//	
//		t1.setLaptop(LapList);
		tx.commit();
		sf.close();
	}
}
