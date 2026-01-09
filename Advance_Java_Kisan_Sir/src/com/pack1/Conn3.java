package com.pack1;

import java.sql.*;

public class Conn3 {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String user="c##sonu";
	String pwd="sonu";
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection(url,user,pwd);
			System.out.println("yes");
			
			Statement stm=conn.createStatement();
			ResultSet rest=stm.executeQuery("select * from Employee");
			while(rest.next()) {
				IO.println(rest.getInt(1)+" "+rest.getString(2)+" "+rest.getString(3)+" "+rest.getInt(4)+" "+rest.getString(5));
			}
		}
		catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		new Conn3().conn();
	}
}
