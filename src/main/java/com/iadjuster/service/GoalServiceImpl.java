package com.iadjuster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iadjuster.model.Goal;
import com.iadjuster.model.GoalReport;
import com.iadjuster.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {


	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {

		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		
		return goalRepository.findAll(); // loadAll(); without Jpa
		
		
	}

	public List<GoalReport> findAllGoalReports() {
		
		return goalRepository.findAllGoalReports();
	}

}
