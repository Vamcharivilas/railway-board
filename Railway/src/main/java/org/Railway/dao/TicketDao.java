package org.Railway.dao;

import java.util.List;

import org.Railway.entity.Ticket;

public interface TicketDao {
	Ticket createTicket(Ticket ticket);

	List<Ticket> getAllTickets();

	Ticket getTicket(int ticketId);

	Ticket updateTicket(int ticketId, Ticket ticket);

	String deleteTicket(int ticketId);

}
