package org.Railway.entity;



import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ticketid;
	int userid;
	int trainid;

	public Ticket(int ticketid, int userid, int trainid) {
		super();
		this.ticketid = ticketid;
		this.userid = userid;
		this.trainid = trainid;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getTrainid() {
		return trainid;
	}

	public void setTrainid(int trainid) {
		this.trainid = trainid;
	}

}
