package org.Railway.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int trainid;
	String trainname;
	String departure;
	String arrival;

	public Train(int trainid, String trainname, String departure, String arrival) {
		super();
		this.trainid = trainid;
		this.trainname = trainname;
		this.departure = departure;
		this.arrival = arrival;
	}

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTrainid() {
		return trainid;
	}

	public void setTrainid(int trainid) {
		this.trainid = trainid;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

}