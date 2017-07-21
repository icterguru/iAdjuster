package com.iadjuster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iadjuster.model.Work;

/*
public interface WorkRepository {

	Work save (Work work);
	
}

*/

@Repository("workRepository")
public interface WorkRepository extends JpaRepository<Work, Long>{

   //	Work save (Work work);  // No need of this
	
}
