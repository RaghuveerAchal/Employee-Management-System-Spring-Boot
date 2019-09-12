package com.sakha;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Mobile {
	
	@Id
	int id;
	String brand;
	String mobile;
	
	@ManyToMany
	Trainee traineeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Trainee getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Trainee traineeId) {
		this.traineeId = traineeId;
	}

	public Mobile(int id, String brand, String mobile, Trainee traineeId) {
		super();
		this.id = id;
		this.brand = brand;
		this.mobile = mobile;
		this.traineeId = traineeId;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", mobile=" + mobile + ", traineeId=" + traineeId + "]";
	}
	
	

}
