package com.cg.iter.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.iter.bean.Training;
import com.cg.iter.dao.TrainingDaoImpl;

public class TrainingServiceImpl implements TrainingService{
	TrainingDaoImpl dao=null;
	public TrainingServiceImpl() {
		dao=new TrainingDaoImpl();
	}
	@Override
	public List<Training> getAllTrainingDetails() throws SQLException {
		return dao.getAllTrainingDetails();
	}
	
	@Override
	public String UpdateAvailableseats(int id) throws SQLException{
		return dao.UpdateAvailableseats(id);
	}
}