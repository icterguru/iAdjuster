package com.iadjuster.restfulWebServices;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// http://www.techpages.org/webservice/simple-restful-web-services-using-java-and-mysql-example/2009/




import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


// See: How to program Database Connection to RESTFUL Webservice using MySQL Database
// https://www.youtube.com/watch?v=2N2ld-YhTnk

public class DbConnectionDAO {

	public static Connection connection;
	public static Statement statement;
	public static PreparedStatement pst;
	public static ResultSet rs = null;
	private static String sqlQuery = null;

	static int numRowsChanged = 0;

	public static Connection setDBConnection() throws Exception
	{
		try
		{
			String connectionURL = "jdbc:mysql://iadjustertest.can6aqqzvhtp.us-west-2.rds.amazonaws.com:3306/iadjustertest";
			//"jdbc:mysql://localhost:3306/test";

			//	Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "iadjustertest", "iadjustertest");
			if (connection != null) {
				// System.out.println("Connected to the Database...");
			}

			return connection;
		}
		catch (SQLException e)
		{
			throw e;
		}
		catch (Exception e)
		{
			throw e;
		}

	}


	public static void jdbcConnectionClose() {
		if (connection != null) {
			try {
				System.out.println("Closing Database Connection...");
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	public ResultSet getResultSet(String sqlQuery, Connection conn) throws SQLException{
		//	this.sqlQuery = sqlQuery;
		//System.out.println("The sqlQuery is: " + sqlQuery);
		//System.out.println("The this.sqlQuery is: " + this.sqlQuery);

		try{
			statement = connection.createStatement();
			rs = statement.executeQuery(sqlQuery);		
		}
		catch(SQLException ex){
			System.out.println(ex);			
		}

		return rs;

	}

	public static void getUsersFromDB() {
		try {
			sqlQuery = "select *  from user";
			statement = connection.createStatement();
			rs = statement.executeQuery(sqlQuery);

			System.out.println("UserName " + "\t\t" +"Password ");
			while(rs.next()){
				//int id= rs.getInt("id");
				String username= rs.getString("username");
				String password= rs.getString("password");
				System.out.println("  " + username + "\t\t" + password);				
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}




	public  Response deleteUserByUserId(@PathParam ("userId") int userId ) throws SQLException{

		int numRowsChanged;

		//System.out.println("userId : " + userId );
		String sqlQuery = "DELETE from user where userid = '" + userId +"'";

		System.out.println("Query executed: " + sqlQuery );

		try{
			//dbConnection = new DbConnectionDAO();
			connection = DbConnectionDAO.setDBConnection();
			statement = connection.createStatement();
			numRowsChanged = statement.executeUpdate(sqlQuery);

			System.out.println("numRowsChanged : " + numRowsChanged );
			//System.out.println("Deleted record with : " + userId);
		}

		catch(Exception e){
			System.out.println(e);

		}
		finally{
			if (connection != null)	{
				connection.close();
			}
		}

		return Response.ok().build();

	}

	public Response userPOSTOperation(@PathParam("username") String username,	@PathParam("password") String password) throws SQLException{
		
		String sqlQuery = "INSERT INTO user (username, password) values ('" +"username" +"',"+ "'password" +"')";	


		//		dbConnection = new DbConnectionDAO();


		System.out.println("Query executed: " + sqlQuery );

		try 
		{
			connection = DbConnectionDAO.setDBConnection();
			statement = connection.createStatement();
			numRowsChanged = statement.executeUpdate(sqlQuery);

		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return Response.ok().build();

	}

	public static void main(String[] args) throws Exception
	{
		DbConnectionDAO dbConnectionDAO = new DbConnectionDAO();
		/*
		setDBConnection();
		System.out.println("Inside main()...");
		dbConnectionDAO.deleteUserByUserId(4);
		getUsersFromDB();*/
		dbConnectionDAO.userPOSTOperation("xxx", "yyyy");

		jdbcConnectionClose();

	}


}
