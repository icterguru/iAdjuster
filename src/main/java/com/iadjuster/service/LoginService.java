package com.iadjuster.service;


public class LoginService {

	  public boolean validateUser(String user, String password) {
	        return user.equalsIgnoreCase("ia") && password.equals("ia");
	    }


}