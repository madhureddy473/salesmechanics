package com.qa.pages;


import java.sql.*;

public class DBHelpers {

    private Connection con = null;
    private ResultSet rs = null;

    public Connection GetDBConnection(String dbUrl, String dbUser, String dbPassword) throws Exception, IllegalAccessException {
        String dbClass = "oracle.jdbc.driver.OracleDriver";
        System.out.println(dbUrl);
        try {
            Class.forName(dbClass);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Oracle SQL ERROR: " + dbUrl + "");
            e.printStackTrace();
            throw new Exception(String.format("Oracle SQL ERROR: %s ", e.getMessage()));
        }
        return con;
    }

    public ResultSet getResultSet(Connection connection, String query ) throws Exception {
        try {
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
        } catch (SQLException se) {
            throw new Exception("Error Message : "+se.getMessage() +", Error code : "+se.getErrorCode());
        } catch(Exception ex) {
            throw new Exception("Error Message : "+ex.getMessage());
        }

        return rs;
    }

    public int getRowCount(ResultSet rs) throws Exception{
        int rowsCount = 0;
        try {
            rs.last();
            rowsCount = rs.getRow();
            rs.beforeFirst();
        } catch (SQLException se) {
            throw new Exception("Error Message : "+se.getMessage() +", Error code : "+se.getErrorCode());
        } catch(Exception ex) {
            throw new Exception("Error Message : "+ex.getMessage());
        }

        return rowsCount;
    }

    public void closeResultSet(ResultSet rs) throws Exception {
        try {
            if (!(rs == null)) {
                rs.close();
            }
        }catch (Exception e) {
            throw new Exception("Error while closing the result set: " +e.getMessage());
        }
    }
}