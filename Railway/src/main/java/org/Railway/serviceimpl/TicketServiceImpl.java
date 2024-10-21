package org.Railway.serviceimpl;

import java.util.List;

import org.Railway.dao.TicketDao;
import org.Railway.entity.Ticket;
import org.Railway.service.TicketService;

public class TicketServiceImpl implements TicketService {
	private final TicketDao ticketDao;

	public TicketServiceImpl(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.createTicket(ticket);
	}

	@Override
	public List<Ticket> getAllTickets() {
		return ticketDao.getAllTickets();
	}

	@Override
	public Ticket getTicket(int ticketId) {
		return ticketDao.getTicket(ticketId);
	}

	@Override
	public Ticket updateTicket(int ticketId, Ticket ticket) {
		return ticketDao.updateTicket(ticketId, ticket);
	}

	@Override
	public String deleteTicket(int ticketId) {
		return ticketDao.deleteTicket(ticketId);
	}
}
