package com.iadjuster.restfulWebServices;


//@XmlRootElement(name = "userObject")
public class UserObject {
	private int userid;
	private String username;
	private String password;
	
	  public UserObject(){}

	   public UserObject(int userid, String username, String password){
	      this.userid = userid;
	      this.username = username;
	      this.password = password;
	   }

	public String getPassword() {
		return password;
	}
	public int getUserid() {
		return userid;
	}
	public String getUsername() {
		return username;
	}
	
	//@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	
	//@XmlElement
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	//@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}

}
