package org.Railway.service;

import org.Railway.entity.Seat;

public interface SeatService {

	Seat createSeat(Seat seat);

	Seat getTrain(int seatId);

	Seat updateSeat(String SeatId, Seat Seat);

	Seat deleteSeat(String seatId);

}
