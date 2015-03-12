package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBPostgreSqlVersion {
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

    
        //String url = "jdbc:postgresql://localhost/postgres";
        String serverName = "localhost";
        String portNumber = "5432";
        String sid = "postgres";
        String url = "jdbc:postgresql://" + serverName + ":" + portNumber + "/" + sid;
        String user = "postgres";
        String password = "postgres";

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT VERSION()");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DBPostgreSqlVersion.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(DBPostgreSqlVersion.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }	

}
