package com.iadjuster.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name = "claims")
public class Claim {

	public static final String FIND_ALL_CLAIMS = "findAllClaims";
	public static final String FIND_CLAIM_REPORTS = "findClaimReports";
	
	@Id
	@GeneratedValue
	@Column(name= "CLAIM_ID")
	@Range(min = 1, max = 999999)
	private Long claimId;
	
	@Range(min = 1, max = 999999)
	@Column(name="CLAIM_NO")
	private int claimNo;
	
	@Column(name="CLAIM_TYPE")
	private String claimType;
	

	@OneToMany(mappedBy="claim", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Work> claimedworks = new ArrayList<Work>();

	public List<Work> getClaimedworks() {
		return claimedworks;
	}

	public Long getClaimId() {
		return claimId;
	}

	public int getClaimNo() {
		return claimNo;
	}

	public String getClaimType() {
		return claimType;
	}

	public void setClaimedworks(List<Work> claimedworks) {
		this.claimedworks = claimedworks;
	}
	
	

	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}

	public void setClaimNo(int claimNo) {
		this.claimNo = claimNo;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}


/*
	@OneToMany(mappedBy="claim", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Work> works = new ArrayList<Work>();
	
	
	public List<Work> getWorks() {
		return works;
	}
	public void setWorks(List<Work> works) {
		this.works = works;
	}
	
*/
	

}
