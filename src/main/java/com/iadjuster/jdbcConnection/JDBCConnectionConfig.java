package com.iadjuster.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnectionConfig {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet rs = null;

	public static void getJdbcConnection() {
		String dbURL = "jdbc:mysql://iadjustertest.can6aqqzvhtp.us-west-2.rds.amazonaws.com:3306/iadjustertest";
		String user = "iadjustertest";
		String password = "iadjustertest";
		connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to Database...");
			connection = DriverManager.getConnection(dbURL, user, password);
			if (connection != null) {
				System.out.println("Connected to the Database...");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}


	public static void getClaimsFromDB() {
		try {
			String query = "select *  from claims";
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			System.out.println("Claim_NO " + "\t" +"Claim_TYPE ");
			while(rs.next()){
				int claim_no= rs.getInt("CLAIM_NO");
				String claim_type= rs.getString("CLAIM_TYPE");
				System.out.println("  " + claim_no + "\t\t  " +claim_type);
				
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static void getUsersFromDB() {
		try {
			String query = "select *  from users";
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

	public static void closeJdbcConnection() {
		if (connection != null) {
			try {
				System.out.println("Closing Database Connection...");
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
	
/*	public static void main(String[] args)
	{
		getJdbcConnection();
		System.out.println("Inside main()...");
		getClaimsFromDB();
		getUsersFromDB();
		
		closeJdbcConnection();
		
	}
*/	
	
}

