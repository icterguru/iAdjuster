package jdbcOperationTests;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Local_JDBCConnectionTest_iAdjuster {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet rs;

	@BeforeClass
	public static void setUp() {
		String dbURL = "jdbc:mysql://localhost:3306/iAdjuster";
		String user = "root";
		String password = "password";
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

	@Test
	public void getClaimsAWS_DB() {
		try {
			String query = "select * from claims";
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


	@AfterClass
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
}
