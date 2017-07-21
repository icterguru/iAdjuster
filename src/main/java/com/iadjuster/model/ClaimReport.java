package com.iadjuster.model;

public class ClaimReport {

	private int 	claim_claimNo;
	private String 	claim_claimType;
	private int 	work_workHour;
	private String 	work_task;
	
	private String work_insuredName;
	private String work_insuredContact;
	private String work_insuranceName;
	private String work_insuranceType;
	
	private String work_claimStartDate;
	private String work_claimDueDate;
	
	private String work_adjusterName;


	private String work_adjusterId;


	public ClaimReport(  int claim_claimNo, String 	claim_claimType, int work_workHour, String 	work_task, String work_insuredName, String work_insuredContact,
	String work_insuranceName, String work_insuranceType, String work_claimStartDate, String work_claimDueDate, String work_adjusterName, String work_adjusterId){
		super();
		this.setClaim_claimNo(claim_claimNo);
		this.claim_claimType = claim_claimType;
		this.work_workHour = work_workHour;
		this.work_task = work_task;
		this.work_insuredName = work_insuredName;
		this.work_insuredContact = work_insuredContact;
		this.work_insuranceName = work_insuranceName;
		this.work_insuranceType = work_insuranceType;
		this.work_claimStartDate = work_claimStartDate;
		this.work_claimDueDate = work_claimDueDate;
		
		this.work_adjusterName = work_adjusterName;
		this.work_adjusterId = work_adjusterId;
		
	}


	public int getClaim_claimNo() {
		return claim_claimNo;
	}

	public String getClaim_claimType() {
		return claim_claimType;
	}


	public String getWork_adjusterId() {
		return work_adjusterId;
	}


	public String getWork_adjusterName() {
		return work_adjusterName;
	}


	public String getWork_claimDueDate() {
		return work_claimDueDate;
	}


	public String getWork_claimStartDate() {
		return work_claimStartDate;
	}


	public String getWork_insuranceName() {
		return work_insuranceName;
	}


	public String getWork_insuranceType() {
		return work_insuranceType;
	}


	public String getWork_insuredContact() {
		return work_insuredContact;
	}


	
	public String getWork_insuredName() {
		return work_insuredName;
	}




	public String getWork_task() {
		return work_task;
	}


	public int getWork_workHour() {
		return work_workHour;
	}



	public void setClaim_claimNo(int claim_claimNo) {
		this.claim_claimNo = claim_claimNo;
	}


	public void setClaim_claimType(String claim_claimType) {
		this.claim_claimType = claim_claimType;
	}


	public void setWork_adjusterId(String work_adjusterId) {
		this.work_adjusterId = work_adjusterId;
	}


	public void setWork_adjusterName(String work_adjusterName) {
		this.work_adjusterName = work_adjusterName;
	}


	public void setWork_claimDueDate(String work_claimDueDate) {
		this.work_claimDueDate = work_claimDueDate;
	}


	public void setWork_claimStartDate(String work_claimStartDate) {
		this.work_claimStartDate = work_claimStartDate;
	}

	public void setWork_insuranceName(String work_insuranceName) {
		this.work_insuranceName = work_insuranceName;
	}

	public void setWork_insuranceType(String work_insuranceType) {
		this.work_insuranceType = work_insuranceType;
	}


	public void setWork_insuredContact(String work_insuredContact) {
		this.work_insuredContact = work_insuredContact;
	}

	public void setWork_insuredName(String work_insuredName) {
		this.work_insuredName = work_insuredName;
	}


	public void setWork_task(String work_task) {
		this.work_task = work_task;
	}


	public void setWork_workHour(int work_workHour) {
		this.work_workHour = work_workHour;
	}


	
}
