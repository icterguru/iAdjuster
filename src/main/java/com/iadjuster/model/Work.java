package com.iadjuster.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Work {

	@Id
	@GeneratedValue
	private Long workId;
	
	
	@Range(min = 0, max = 999999)
	private int workHour;

	//@NotNull
	private String insuredName;
	
	//@NotNull
	private String insuredContact;
	
	//@NotNull
	private String insuranceName;


	//@NotNull
	private String insuranceType;


	//@NotNull
	private String claimType;


	//@NotNull
	private String claimStartDate;


	//@NotNull
	private String claimDueDate;


	//@NotNull
	private String adjusterName;


	//@NotNull
	private String adjusterId;


	@NotNull
	@Column(name= "CLAIM_TYPE")
	private String task;  // This is an Object of Task class;  cannot be renamed until you rename Task.java class.


	@ManyToOne
	private Claim claim;


	public String getAdjusterId() {
		return adjusterId;
	}


	public String getAdjusterName() {
		return adjusterName;
	}




	public Claim getClaim() {
		return claim;
	}


	public String getClaimDueDate() {
		return claimDueDate;
	}


	public String getClaimStartDate() {
		return claimStartDate;
	}


	public String getClaimType() {
		return claimType;
	}


	public String getInsuranceName() {
		return insuranceName;
	}


	public String getInsuranceType() {
		return insuranceType;
	}


	public String getInsuredContact() {
		return insuredContact;
	}


	public String getInsuredName() {
		return insuredName;
	}


	public String getTask() {
		return task;
	}
	
	public int getWorkHour() {
		return workHour;
	}

	public Long getWorkId() {
		return workId;
	}
	
	public void setAdjusterId(String adjusterId) {
		this.adjusterId = adjusterId;
	}
	

	public void setAdjusterName(String adjusterName) {
		this.adjusterName = adjusterName;
	}
	
	public void setClaim(Claim claim) {
		this.claim = claim;
	}


	public void setClaimDueDate(String claimDueDate) {
		this.claimDueDate = claimDueDate;
	}


	public void setClaimStartDate(String claimStartDate) {
		this.claimStartDate = claimStartDate;
	}


	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}


	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}


	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}


	public void setInsuredContact(String insuredContact) {
		this.insuredContact = insuredContact;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	
	public void setTask(String task) {
		this.task = task;
	}


	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}


	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	
}
