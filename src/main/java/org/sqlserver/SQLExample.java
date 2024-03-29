package org.sqlserver;

import java.sql.*;

public class SQLExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        sqlConnect();
    }
    static void sqlConnect() throws ClassNotFoundException, SQLException {
        //String connectionUrl =
        //        "jdbc:sqlserver://KHADIJA\\SQLEXPRESS:1433;databaseName=epr_db;integratedSecurity=true;";
        String connectionUrl =
                "jdbc:sqlserver://KHADIJA:1433;databaseName=Practice;user=sa;password=1234;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(connectionUrl);

        if (conn != null) {
            System.out.println("Connected");
            DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
            Statement statement= conn.createStatement();
            String query="Select * from TBL_Employee";
            ResultSet resultSet= statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println("ID : ->\t"+resultSet.getInt(1));
                System.out.println("Name : ->\t"+resultSet.getString(2));
                System.out.println("Salary : ->\t"+resultSet.getBigDecimal(3));
            }
        }
    }
}
