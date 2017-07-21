package com.iadjuster.service;

import java.util.List;

import com.iadjuster.model.Claim;
import com.iadjuster.model.ClaimReport;
import com.iadjuster.model.Task;

public interface ClaimService {

	Claim save(Claim claim);

	List<Claim> findAllClaims();

	List<ClaimReport> findAllClaimReports();

}