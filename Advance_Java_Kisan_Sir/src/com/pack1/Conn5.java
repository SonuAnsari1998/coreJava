package com.pack1;

import java.sql.*;

public class Conn5 {
	void main() {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userId="c##sonu";
		String pwd="sonu";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection(url,userId,pwd);
			IO.println("Connected successfully.............");
			
			Statement stm=conn.createStatement();
			ResultSet rest=stm.executeQuery("Select * from Employee");
			while(rest.next()) {
				IO.println(rest.getInt(1));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
