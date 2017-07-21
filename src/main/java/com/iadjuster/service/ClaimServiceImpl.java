package com.iadjuster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iadjuster.model.Claim;
import com.iadjuster.model.ClaimReport;
import com.iadjuster.repository.ClaimRepository;


@Service("claimService")
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	private ClaimRepository claimRepository;

	@Transactional
	public Claim save(Claim claim) {

		return claimRepository.save(claim);
	}


	public List<Claim> findAllClaims() {
		return claimRepository.findAll(); // loadAll(); without Jpa

	}


	public List<ClaimReport> findAllClaimReports() {

		return claimRepository.findAllClaimReports();
	}


}

