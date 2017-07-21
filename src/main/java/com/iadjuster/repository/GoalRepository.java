package com.iadjuster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iadjuster.model.Goal;
import com.iadjuster.model.GoalReport;

/*
public interface GoalRepository{

	Goal save(Goal goal);//	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();
	
}
*/
// With JpaRepository

@Repository("goalRepository")
public interface GoalRepository extends JpaRepository<Goal, Long> {
	@Query("Select new com.iadjuster.model.GoalReport(g.minutes, e.minutes, e.activity) " +
			"from Goal g, Exercise e where g.id = e.goal.id")
	List<GoalReport> findAllGoalReports();
	
}
