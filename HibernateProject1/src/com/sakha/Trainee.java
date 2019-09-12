package com.sakha;
import javax.persistence.Entity;

import org.hibernate.annotations.CollectionType;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity


public class Trainee {
	@Id
	@GeneratedValue
	int tid;
	String tname;
	int tage;
	@ManyToMany
	List<Laptop> laptop = new ArrayList();
	
//	@ElementCollection(fetch=FetchType.EAGER)
//	List <String> mobile;
	



	public List<Laptop> getLaptop() {
		return laptop;
	}



	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}



	public Trainee() {
		super();
	}
	

	
	public Trainee(String tname, int tage) {
		super();
		this.tname = tname;
		this.tage = tage;
	}

	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}



	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", tname=" + tname + ", tage=" + tage + "]";
	}


	
	
}
