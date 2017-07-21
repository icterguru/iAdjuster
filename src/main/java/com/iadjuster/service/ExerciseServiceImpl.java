package com.iadjuster.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iadjuster.model.Activity;
import com.iadjuster.model.Exercise;
import com.iadjuster.repository.ExerciseRepository;


@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;
	
	
	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		
		Activity walk = new Activity();
		walk.setActivityDesc("Walk");
		activities.add(walk);
		
		Activity run = new Activity();
		run.setActivityDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setActivityDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setActivityDesc("Swim");
		activities.add(swim);
		
		return activities;
	}

	@Transactional
	public Exercise save(Exercise exercise) {
		
		exercise = exerciseRepository.save(exercise);
		
		
		return exercise;
	}
	
}
