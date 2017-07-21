package com.iadjuster.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ActivityRespoitoryImpl implements ActivityRepository {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet rs;

	public static void setUp() {
		String dbURL = "jdbc:mysql://iadjustertest.can6aqqzvhtp.us-west-2.rds.amazonaws.com:3306/iadjustertest";
		//String dbURL = "jdbc:mysql://localhost:3306/iAdjuster";
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

	public static void tearDown() {
		if (connection != null) {
			try {
				System.out.println("Closing Database Connection...");
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	private String activityId;



	/*
	@Override
	public void delete(String activityId) {
		// Delete from Activity where activityId = ?

	}

	@Override
	public void create(Activity activity) {
		// Should issue an insert statement to the  DB

	}


	@Override
	public Activity update(Activity activity) {
		// Search in the DB to see if we have an activity with that activityId
		// Select * from Activity where activityId = ?
		// if rs == 0 insert into Activity table
		// else update the Activity table

		return activity;
	}



	 */

	//@Override
	public void findAllActivities(){
		try {
			String query = "select claims.CLAIM_NO from claims";
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			while(rs.next()){
				int claim_NO= rs.getInt("CLAIM_NO");
				System.out.println("Claim_NO " +"\t"+claim_NO );
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}




}
