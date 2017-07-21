package com.loginWebService;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

//@Path("/WebService")
@Path("/")
public class LoginService {

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String login(@FormParam("username") String username,
			@FormParam("password") String password) {

		//&nbsp;
		return getAllUsersList(username, password);

	}

	public String getAllUsersList(String username,String password)
	{
		String userListData = null;
		try 
		{
			ArrayList<UserVO> userList = null;
			SecurityManager securityManager= new SecurityManager();
			userList = securityManager.getAllUsersList();
			for (UserVO userVO : userList) {
				if(userVO.getUsername().equals(username))
				{
					if(userVO.getPassword().equals(password))
					{
						return "Logged in User:"+username;
					}
				}
			}

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return "You are not a Valid User";
	}
}