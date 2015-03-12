package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSqlConnTest {
    public static void main(String[] args) throws Exception
    {
    	PostgreSqlConn con = new PostgreSqlConn("postgres", "postgres", "postgres");
    	Connection connection = con.getConnection();
        
        try {
            // build query
            String query = "SELECT VERSION()" ;

            // execute query
            Statement statement = connection.createStatement () ;
            ResultSet rs = statement.executeQuery (query) ;

            // show query results
            while ( rs.next () ){
            	String version = rs.getString(1);            	
            	System.out.printf(version);
            }
            
        }catch (SQLException e){
        		e.printStackTrace();
        	}finally {
        			con.closeConnection(connection);
        		}
        
    }

}
