package org.Railway.dao;

import java.util.List;

import org.Railway.entity.Seat;

public interface SeatDao {
	Seat getSeatById(String seatId);

	List<Seat> getSeatsByTrainId(String trainId);

	void updateSeatAvailability(String seatId, boolean isAvailable);
}
