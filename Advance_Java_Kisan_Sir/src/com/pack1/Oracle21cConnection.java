package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle21cConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "c##sonu";
        String password = "sonu";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded.");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Oracle 21c Connected Successfully!");

            	Statement stmt = con.createStatement();
            	
//            	Creating table
//            	boolean execute = stmt.execute("create table test09(id number(4),name varchar2(20))");
//            	System.out.println(execute);
            	
//            	data inserting
//            int rows = stmt.executeUpdate("insert into test09 values(101,'DC Goutam')");
//            if(rows>0) {
//            	System.out.println("Data inserted!!!");
//            }else {
//            	System.out.println("Data not insert...");
//            }
            
//            	data retriving
//            	ResultSet rs = stmt.executeQuery("select * from test09");
//            	while(rs.next()) {
//            		System.out.println(rs.getInt(1)+", "+rs.getString(2));
//            	}
            	
            	
            	
            	ResultSet rs = stmt.executeQuery("SELECT * FROM test09");

            	ResultSetMetaData rsmd = rs.getMetaData();
            	int columnCount = rsmd.getColumnCount();
            	    for (int i = 1; i <= columnCount; i++) {
            	        String columnName = rsmd.getColumnName(i);
            	        System.out.print(columnName+"\t");
            	    }
            	    System.out.println();
            	    
            	    
            	while(rs.next()) {
            		System.out.println(rs.getInt(1)+", "+rs.getString(2));
            	}
            
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

