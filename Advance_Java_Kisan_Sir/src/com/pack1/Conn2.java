package com.pack1;

import java.sql.*;



public class Conn2 {

	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String user="c##sonu";
	String pwd="sonu";
	public void conn() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn= DriverManager.getConnection(url,user,pwd);
				
				Statement stm= conn.createStatement();
				
				ResultSet rs=stm.executeQuery("select * from Employee where ESAL=55000");
				
				while (rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();	
			}
	}
	public static void main(String[] args) {
			new Conn2().conn();
	}
}
