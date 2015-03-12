package com.company;

import java.sql.DriverManager;
import java.sql.ResultSet ;
import java.sql.Statement ;
import java.sql.Connection;
import java.sql.SQLException;
 
public class ConnectionSample
{
	private static Connection getConnection() throws Exception {
		Connection connection = null;
		 // Load the JDBC driver
        String driverName = "oracle.jdbc.driver.OracleDriver";
        Class.forName(driverName);
        // Create a connection to the database
        String serverName = "localhost";
        String portNumber = "1521";
        String sid = "orcl";
        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
        String username = "hr";
        String password = "hr";
        connection = DriverManager.getConnection(url, username, password);
        return connection;
	}
	private static void closeConnection(Connection connection) throws SQLException {
		if (connection != null && !connection.isClosed()) {        
		connection.close();
		}
	}
    public static void main(String[] args) throws Exception
    {
    	Connection connection = getConnection();
        
        try {
            // build query
            String query = "SELECT * From employees" ;

            // execute query
            Statement statement = connection.createStatement () ;
            ResultSet rs = statement.executeQuery (query) ;

            // show query results
            while ( rs.next () ){
            	String eid = rs.getString("employee_id");
            	String fname = rs.getString("first_name");
            	String lname = rs.getString("last_name");
            	System.out.printf("%s, %s, %s\n", eid, fname, lname);
            }
            
        }catch (SQLException e){
        		e.printStackTrace();
        	}finally {
        			closeConnection(connection);
        		}
        
    }
}
