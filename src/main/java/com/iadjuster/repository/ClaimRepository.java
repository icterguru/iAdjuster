package com.iadjuster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iadjuster.model.Claim;
import com.iadjuster.model.ClaimReport;


@Repository("claimRepository")
public interface ClaimRepository extends JpaRepository<Claim, Long> {
	@Query("Select new com.iadjuster.model.ClaimReport(c.claimNo, c.claimType, w.workHour, w.task, "
			+ " w.insuredName, w.insuredContact, w.insuranceName, w.insuranceType, " 
			+ " w.claimStartDate, w.claimDueDate, w.adjusterName, w.adjusterId) " +
			"from Claim c, Work w where c.id =w.claim.id")
	List<ClaimReport> findAllClaimReports();
	
}
