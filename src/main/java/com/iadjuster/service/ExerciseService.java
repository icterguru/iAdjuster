package com.iadjuster.service;

import java.util.List;

import com.iadjuster.model.Activity;
import com.iadjuster.model.Exercise;
import com.iadjuster.model.Goal;
import com.iadjuster.model.GoalReport;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}

/**

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();


	List<GoalReport> findAllGoalReports();

	
}

**/
