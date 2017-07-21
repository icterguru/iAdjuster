package com.iadjuster.service;

import java.util.List;

import com.iadjuster.model.Task;
import com.iadjuster.model.Work;

public interface WorkService {

	List<Task> findAllTasks();

	Work save(Work work);

}

/**


public interface ClaimService {

	Claim save(Claim claim);

	List<Claim> findAllClaims();

	List<ClaimReport> findAllClaimReports();

}


**/
