package org.Railway.service;

import java.util.List;

import org.Railway.entity.Ticket;

public interface TicketService {

	Ticket createTicket(Ticket ticket);

	List<Ticket> getAllTickets();

	Ticket getTicket(int ticketId);

	Ticket updateTicket(int ticketId, Ticket ticket);

	String deleteTicket(int ticketId);
}
