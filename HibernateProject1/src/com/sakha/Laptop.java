package com.sakha;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@GeneratedValue()
	int laptopid;
	String brand;
	@ManyToMany(cascade=CascadeType.ALL)
	List <Trainee> trainee = new ArrayList();
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}

	public Laptop(String brand) {
		super();
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [laptopid=" + laptopid + ", brand=" + brand+"]";
	}

	public int getLaptopid() {
		return laptopid;
	}
	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	

}
