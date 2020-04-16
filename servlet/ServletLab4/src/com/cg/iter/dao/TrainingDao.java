package com.cg.iter.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.iter.bean.Training;

public interface TrainingDao {
	public List<Training> getAllTrainingDetails() throws SQLException;
	public String UpdateAvailableseats(int id) throws SQLException;
}