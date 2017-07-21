package com.loginWebService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// http://www.techpages.org/webservice/simple-restful-web-services-using-java-and-mysql-example/2009/


// See: How to program Database Connection to RESTFUL Webservice using MySQL Database
// https://www.youtube.com/watch?v=2N2ld-YhTnk

public class DbConnection {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet rs = null;

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
				System.out.println("Connected to the Database...");
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

	public static void getUsersFromDB() {
		try {
			String query = "select *  from user";
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

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
	
	public static void main(String[] args) throws Exception
	{
		setDBConnection();
		System.out.println("Inside main()...");
		getUsersFromDB();
		
		jdbcConnectionClose();
		
	}
	
	
}
