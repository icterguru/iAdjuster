package com.iadjuster.model;

public class Activity {

	private String activityDesc;
	//long id;  // was the original one
		private long activityId;  
	//private Long  id;  will not work
	
	public long getActivityId() {
		return activityId;
	}

	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}


	public String getActivityDesc() {
		return activityDesc;
	}

	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}


	
}
