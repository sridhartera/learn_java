package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlConn {
	private static String username;
	private static String password;
	private static String sid;
	public PostgreSqlConn(String user, String pass, String si){
		username = user;
		password = pass;	
		sid = si;
	}
	public Connection getConnection() throws Exception {
		Connection connection = null;
		 // Load the JDBC driver
        String driverName = "org.postgresql.Driver";
        try {
        	  Class.forName(driverName);
        	} catch (ClassNotFoundException cnfe) {
        	  System.err.println("Couldn't find driver class:");
        	  cnfe.printStackTrace();
        	} 
        // Create a connection to the database
        String serverName = "localhost";
        String portNumber = "5432";
        //String sid = "postgres";
        String url = "jdbc:postgresql://" + serverName + ":" + portNumber + "/" + sid;
        //String username = "postgres";
        //String password = "postgres";
        connection = DriverManager.getConnection(url, username, password);
        return connection;
	}
	public void closeConnection(Connection connection) throws SQLException {
		if (connection != null && !connection.isClosed()) {        
		connection.close();
		}
	}
}
