package com.iadjuster.jdbcConnection;



public class JDBCConnectionMain extends JDBCConnectionConfig{

	public static void main(String[] args)
	{
		getJdbcConnection();
		System.out.println("Inside main()...");
		getClaimsFromDB();
		getUsersFromDB();
		
		closeJdbcConnection();
	
	}
}

