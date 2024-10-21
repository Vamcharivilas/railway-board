package org.Railway.service;

import org.Railway.entity.Train;

public interface TrainService {
	Train createTrain(Train train);

	Train getTrain(int trainId);

	Train updateTrain(int trainId, Train train);

	Train deleteTrain(int trainId);

}
