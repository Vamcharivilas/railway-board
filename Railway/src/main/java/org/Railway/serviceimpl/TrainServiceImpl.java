package org.Railway.serviceimpl;

import org.Railway.dao.TrainDao;
import org.Railway.entity.Train;
import org.Railway.service.TrainService;

public class TrainServiceImpl implements TrainService {
	private final TrainDao trainDao;

	public TrainServiceImpl(TrainDao trainDao) {
		this.trainDao = trainDao;
	}

	@Override
	public Train createTrain(Train train) {
		return trainDao.createTrain(train);
	}

	@Override
	public Train getTrain(int trainId) {
		return trainDao.getTrain(trainId);
	}

	@Override
	public Train updateTrain(int trainId, Train train) {
		return trainDao.updateTrain(trainId, train);
	}

	@Override
	public Train deleteTrain(int trainId) {
		return trainDao.deleteTrain(trainId);
	}

}