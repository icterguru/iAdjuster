package com.iadjuster.restfulWebServices;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.transaction.annotation.Transactional;

@Path("/dbuser")
public class DBUserRestServices extends DbConnectionDAO{

	String invalidUser = "Invalid user";
	ArrayList<UserObject> invalidUsers = null;


	@GET		// This maps the HTTP method to the relevant java method
	@Path("/")  // URL: http://localhost:8080/iAdjuster/restapi/dbuser/
	@Produces({ MediaType.TEXT_HTML, MediaType.TEXT_PLAIN}) // Tell what is the return type
	public String getMessages() {
		// URL: http://localhost:8080/iAdjuster/restapi/dbuser
		return "Hello World, <h1> This is a RESTful web service </h1> "+ "<br>" 
		+ "<h2><b> <i>The restapi's base url is: </i></b> " +
		"http://localhost:8080/iAdjuster/restapi/dbuser/" + "</h2><br>"		
		+ "<b> Please try with other urls, such as: </b> \n" + "<br> <br>" 
		+ "http://localhost:8080/iAdjuster/restapi/dbuser/getusers/" + "<br>"
		+ "http://localhost:8080/iAdjuster/restapi/dbuser/getuserbyname/test" + "<br>"
		+ "http://localhost:8080/iAdjuster/restapi/dbuser/getusers/testttt" + "<br>"
		+ "http://localhost:8080/iAdjuster/restapi/dbuser/getuserbyid/1" + "<br>"
		+ "http://localhost:8080/iAdjuster/restapi/dbuser/deleteuserbyid/5" + "<br>"	
		+ "http://localhost:8080/iAdjuster/postuser.html" + "<br>"
		;
	}

	@GET
	@Path("/getusers") // URL: http://localhost:8080/iAdjuster/restapi/dbuser/users/
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ArrayList<UserObject> getAllUsers() throws SQLException{
		ArrayList<UserObject> userList = new ArrayList<UserObject>();

		DbConnectionDAO dbConnection = new DbConnectionDAO();

		String sqlQuery = "select * from user";
		System.out.println("GET Query executed: " + sqlQuery );
		UserObject userobj = new UserObject();

		try{
			connection = DbConnectionDAO.setDBConnection();
			rs = dbConnection.getResultSet(sqlQuery, connection);
			//	System.out.println("UserName " + "\t\t" +"Password ");
			while (rs.next()) {
				userobj.setUserid(rs.getInt("userid"));
				userobj.setUsername(rs.getString("username"));
				userobj.setPassword(rs.getString("password"));
				userList.add(userobj);

			}

		}
		catch(Exception e){
			System.out.println(e);

		}

		finally{
			if (connection != null)	{
				connection.close();
			}

		}

		return userList;
	}



	@GET
	@Path("getuserbyid/{userId}") // URL: http://localhost:8080/iAdjuster/restapi/dbuser/users/test
	@Produces({MediaType.TEXT_HTML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String getUsersByUserId(@PathParam("userId") int userId) throws SQLException{

		DbConnectionDAO dbConnection = new DbConnectionDAO();
		System.out.println("userId : " + userId );
		//		String sqlQuery = "select * from user where userid = '" + userId +"'";
		String sqlQuery = "select * from user where userid = " + userId; // both works

		System.out.println("GET Query executed: " + sqlQuery );

		try{
			connection = DbConnectionDAO.setDBConnection();
			rs = dbConnection.getResultSet(sqlQuery, connection);
			System.out.println("UserName " + "\t\t" +"Password ");

			if (rs.next()) {
				int userid = rs.getInt("userid");
				String username= rs.getString("username");	
				String password= rs.getString("password");
				System.out.println("  " + username + "\t\t" + password);				

				return "Hello " + username + "</b> \n\t your id is: " + userid + " and password is: "+ password ;
			}
			else{
				return invalidUser;
			}

		}

		catch(Exception e){
			System.out.println(e);

		}

		finally{
			if (connection != null)	{
				connection.close();
			}
		}
		return invalidUser;

	}


	@GET
	@Path("getuserbyname/{userName}") // URL: http://localhost:8080/iAdjuster/restapi/dbuser/users/test
	@Produces({MediaType.TEXT_HTML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String getUsersByUserName(@PathParam("userName") String userName) throws SQLException{

		DbConnectionDAO dbConnection = new DbConnectionDAO();
		System.out.println("userName : " + userName );
		String sqlQuery = "select * from user where username = '" + userName +"'";
		//String sqlQuery = "select * from user where username = " + userName ; 
		// Works with:  http://localhost:8080/iAdjuster/restapi/dbuser/getuserbyname/'test' 

		System.out.println("GET Query executed: " + sqlQuery );

		try{
			connection = DbConnectionDAO.setDBConnection();
			rs = dbConnection.getResultSet(sqlQuery, connection);
			System.out.println("UserName " + "\t\t" +"Password ");

			if (rs.next()) {
				int userid = rs.getInt("userid");
				String username= rs.getString("username");	
				String password= rs.getString("password");
				System.out.println("  " + username + "\t\t" + password);				

				//return "Welcome <b>" + username + "</b> \n\t your id is: " + userid + " and password is: "+ password ;
				return "Hello " + username + "</b> \n\t your id is: " + userid + " and password is: "+ password ;

			}
			else{
				return invalidUser;
			}

		}

		catch(Exception e){
			System.out.println(e);

		}

		finally{
			if (connection != null)	{
				connection.close();
			}
		}
		return invalidUser;

	}




	/*

	 * This method takes form parameters

	 * from a test form called form_putuser.jsp

	 */

	@POST
	@Path("/postuser")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	@Transactional

	public Response testFormPOSToperation(@FormParam("username") String username,
			@FormParam("password") String password) throws SQLException{

		// PreparedStatement is used to build a SQL statement

		PreparedStatement preparedStatement = null;
		// String is used to hold SQL query statement with parameter placeholders (?)

		String sqlPOST = "INSERT INTO user (username, password) values (?,?)";

		System.out.println("POST Query executed: " + sqlPOST );

		try{

			// Open a connection to the database

			connection = DbConnectionDAO.setDBConnection();

			// Use the connection object to complete the PreparedStatement object
			preparedStatement = connection.prepareStatement(sqlPOST);

			// Pass the username info into parameter placeholder
			preparedStatement.setString(1, username);

			// Pass the password info into parameter placeholder
			preparedStatement.setString(2, password);

			// Execute the query
			preparedStatement.execute();

		} 

		catch (Exception e)	{
			System.out.println(e.getMessage());
		}

		finally
		{
			if (connection != null)	{
				connection.close();

			}

		}

		return Response.ok().build();

	}

	@POST
	@Path("/postuser1/{username}/{password}")
	// http://localhost:8080/iAdjuster/restapi/dbuser/postuser1/John/Michael
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	@Transactional
	public Response userPOSTOperation( @PathParam("userid") int userId, @PathParam("username") String username,
			@PathParam("password") String password) throws SQLException{

		// PreparedStatement is used to build a SQL statement
		PreparedStatement preparedStatement = null;  // Uses import java.sql.PreparedStatement;
		// String is used to hold SQL query statement with parameter placeholders (?)
		String sqlPOST = "INSERT INTO user (username, password) values (?,?)";
		// Create a database connection
		//dbConnection = new DbConnectionDAO();
		System.out.println("POST Query executed: " + sqlPOST );

		try{
			// Open a connection to the database
			connection = DbConnectionDAO.setDBConnection();
			// Use the connection object to complete the PreparedStatement object
			preparedStatement = connection.prepareStatement(sqlPOST);
			// Pass the username info into parameter placeholder
			preparedStatement.setString(1, username);
			// Pass the password info into parameter placeholder
			preparedStatement.setString(2, password);		
			preparedStatement.execute();  // Execute the query

		} 

		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		finally	{
			if (connection != null)	{
				connection.close();
			}
		}

		return Response.ok().build();

	}


	@PUT
	/****************************************************************************
	Important: Parameter input is NOT checked for null or empty values
	 *****************************************************************************/
	@Path("/putuser/{userid}/{username}/{password}")
	// http://localhost:8080/iAdjuster/restapi/dbuser/putuser/14/Mosaddek/Hossain
	@Consumes({MediaType.TEXT_HTML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	@Transactional
	public Response userPUToperation( @PathParam("username") String username,
			@PathParam("password") String password, @PathParam("userid") int userid) throws SQLException{

		// This will be used to hold the SQL query statement

		PreparedStatement preparedStatement = null;
		System.out.println("The following has been passed to the server: "
				+ "UserName: " + username + "\t" + "Password: " + password + "\t" + "userid: " + userid);

		//	DbConnectionDAO dbConnection = new DbConnectionDAO();

	
		try{
			// Open a connection to the database
			//	connection = dbConnection.setDBConnection();  // ??
			String sqlPUT = "update user set username = ?, password = ? where userid = ?";
			System.out.println("PUT Query executed : " + sqlPUT );

			connection = DbConnectionDAO.setDBConnection();
			// Use the connection object to complete the PreparedStatement object
			preparedStatement = connection.prepareStatement(sqlPUT);

			// Pass the username info into parameter placeholder
			preparedStatement.setString(1, username);

			// Pass the password info into parameter placeholder
			preparedStatement.setString(2, password);
			// Pass the userid info into parameter placeholder
			preparedStatement.setInt(3, userid);

			//preparedStatement.execute(); 	// Execute the query

			int numRowsChanged = preparedStatement.executeUpdate();
			System.out.println("Number of Rows updated: " + numRowsChanged);
			if (numRowsChanged > 0)
			{
				System.out.println("The record with userid = " + userid + ", has been updated");
				System.out.println("PUT successful.....");

			}
			else{
				preparedStatement = connection.prepareStatement(sqlPUT);

				System.out.println("Oops!! The the userid you have used did not exist");
		//		String sqlQuery = "DELETE from user where userid = '" + userId +"'";

				String sqlPOST = "INSERT INTO user (userid, username, password) values (?,?,?)";

				preparedStatement = connection.prepareStatement(sqlPUT);
			//	UserObject userobj = new UserObject();

				// Pass the userid info into parameter placeholder
				preparedStatement.setInt(1, userid);

				// Pass the username info into parameter placeholder
				preparedStatement.setString(2, username);
				// Pass the password info into parameter placeholder
				preparedStatement.setString(3, password);		

				int rowsInserted = preparedStatement.executeUpdate(); 	// Execute the query

				if (rowsInserted > 0) {
					
				System.out.println("PUT Inserted Query: " + sqlPOST );


				System.out.println("The following insert query has been passed to the server: "
						+ "UserName: " + username + "\t" + "Password: " + password + "\t" + "userid: " + userid);

			}
				else{
					System.out.println("PUT Insert failed.." );
		
				}
			}
			
		} 
		catch (Exception e)	{
			System.out.println(e.getMessage());
		}

		return Response.ok().build();
	}


	@DELETE
	@Path("deleteuserbyid/{userid}") // URL: http://localhost:8080/iAdjuster/restapi/dbuser/deleteuserbyid/5
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_HTML})
	public Response deleteUserByUserId(@PathParam ("userid") int userid ) throws SQLException{
		//https://www.youtube.com/watch?v=HePAArH5BrU&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn&index=20

		
		//System.out.println("userId : " + userId );
		String sqlQuery = "DELETE from user where userid = '" + userid +"'";

		System.out.println("DELETE Query executed: " + sqlQuery );

		try{
			connection = DbConnectionDAO.setDBConnection();
			statement = connection.createStatement();
			int numRowsChanged = statement.executeUpdate(sqlQuery);

			//System.out.println("numRowsChanged : " + numRowsChanged );
			if (numRowsChanged<=0){
				System.out.println("Oops!! The the userid you have used does not exist");
			}
			else{
				System.out.println("The record with userid = " + userid + ", has been delected");
			}

		}

		catch(Exception e){
			System.out.println(e.getMessage());

		}
		finally{
			if (connection != null)	{
				connection.close();
			}
		}

		return Response.ok().build();
	}


}