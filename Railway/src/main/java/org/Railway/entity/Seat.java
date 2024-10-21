package org.Railway.entity;
import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int seatid;
	int trainid;
	int seatnumber;

	public Seat(int seatid, int trainid, int seatnumber) {
		super();
		this.seatid = seatid;
		this.trainid = trainid;
		this.seatnumber = seatnumber;
	}

	public int getSeatid() {
		return seatid;
	}

	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}

	public int getTrainid() {
		return trainid;
	}

	public void setTrainid(int trainid) {
		this.trainid = trainid;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
}