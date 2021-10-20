package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public static Connection getConnection() throws SQLException{
		
		final String username = "postgres";
		final String password = "projectp1";
		//final String url = "jdbc:postgresql://reimbursementdatabase.cxsi6hkq9t16.us-east-2.rds.amazonaws.com/postgres";
		final String url = "jdbc:postgresql://database-reimbursementdatabase.cojsyazpvugp.us-east-2.rds.amazonaws.com/postgres";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		return connection;
	}
}
