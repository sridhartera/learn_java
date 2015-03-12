package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSqlTransaction {
	public static void main(String[] args) throws Exception {
    	PostgreSqlConn psconn = new PostgreSqlConn("postgres", "postgres", "testdb");
    	Connection connection = psconn.getConnection();
    	
        try {
        	connection.setAutoCommit(false);	
            // execute query
            Statement st = connection.createStatement () ;
            st.executeUpdate("UPDATE authors SET name = 'Leo Tolstoy' "
                    + "WHERE Id = 1");
            st.executeUpdate("UPDATE books SET title = 'War and Peace' "
                    + "WHERE Id = 1");
            st.executeUpdate("UPDATE books SET title = 'Anna Karenina' "
                    + "WHERE Id = 2");
            connection.commit();
        }catch (SQLException e){
        	connection.rollback();
        		e.printStackTrace();
        	}finally {
        		psconn.closeConnection(connection);
        		}

	}

}
