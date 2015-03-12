package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgreSqlInsert {
    public static void main(String[] args) throws Exception
    {
    	PostgreSqlConn psconn = new PostgreSqlConn("postgres", "postgres", "testdb");
    	Connection connection = psconn.getConnection();
        try {
        	int id =6;
        	String author = "Sridhar Tera";

        	// build query
            String query = "INSERT INTO authors(id, name) VALUES(?, ?)" ;

            // execute query
            PreparedStatement pst = connection.prepareStatement (query) ;
            pst.setInt(1, id);
            pst.setString(2, author);
            pst.executeUpdate();
            
        }catch (SQLException e){
        		e.printStackTrace();
        	}finally {
        		psconn.closeConnection(connection);
        		}

    }
}
