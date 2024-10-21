package org.Railway.dao;

import org.Railway.entity.Train;

public interface TrainDao {
	Train createTrain(Train train);

	Train getTrain(int trainId);

	Train updateTrain(int trainId, Train train);

	Train deleteTrain(int trainId);

}
