package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostgreSqlRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
    	PostgreSqlConn psconn = new PostgreSqlConn("postgres", "postgres", "testdb");
    	Connection connection = psconn.getConnection();
        try {
        	// build query
            String query = "SELECT * from authors" ;

            // execute query
            PreparedStatement pst = connection.prepareStatement (query) ;
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
            	System.out.println(rs.getInt(1)+":"+rs.getString(2));
            }
        }catch (SQLException e){
        		e.printStackTrace();
        	}finally {
        		psconn.closeConnection(connection);
        		}

	}

}
