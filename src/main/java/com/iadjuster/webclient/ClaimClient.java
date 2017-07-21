package com.iadjuster.webclient;


public class ClaimClient {


	public void delete(String activityId) {
		//http://localhost:8080/exercise-services/webapi/activities/1234

		System.out.println("void delete(String activityId)");
		
	}

	
	public String get(String activityid){
		//http://localhost:8080/exercise-services/webapi/activities/1234
		
		System.out.println("void delete(String activityId)");
		return "get()";
	
		//return response.readEntity(Activity.class);
	}


	public String create(String activity) {
		//http://localhost:8080/exercise-services/webapi/activities/activity
		System.out.println("String create(String activity)");
		return "create(String activity)";
	}

	public String update(String activity) {
		
		//http://localhost:8080/exercise-services/webapi/activities/activity
	
		return "String update(String activity)";
		
	}

}
