package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnTest {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String user="c##sonu";
	String pwd="sonu";
	public Connection connect() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,pwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void getDetails() {
		try {
			Connection conn=connect();
			Statement stm=conn.createStatement();
			ResultSet rest = stm.executeQuery("Select * from Employee");
			while(rest.next()) {
				IO.println(rest.getInt(1)+"\t"+rest.getString(2)+"\t"+"\t"+rest.getString(3)+"\t"+"\t"+rest.getDouble(4)+"\t"+"\t"+rest.getString(5));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void insertData() {
		try {
			int empId=Integer.parseInt(IO.readln("Enter Employee ID"));
			String fname=IO.readln("Enter Employee First Name");
			String lname=IO.readln("Enter Employee Last Name");
			double salary=Double.parseDouble(IO.readln("Enter Employee Salary"));
			String loc=IO.readln("Enter Employee Location");
			
			Connection conn=connect();
			Statement stm=conn.createStatement();
			int rest= stm.executeUpdate("Insert into Employee values ("+empId+", '"+fname+"', '"+lname+"', "+salary+", '"+loc+"')");
			if(rest>=0) {
				IO.print("Data Added Sucessfully.........");
			}else {
				System.err.println("Data not added..........");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteData() {
		try {
			int empId=Integer.parseInt(IO.readln("Enter Employee id"));
			
			Connection conn=connect();
			Statement stm= conn.createStatement();
			int row= stm.executeUpdate("delete from Employee where id="+empId+"");
			
			if(row>0) {
				IO.println("Data Deleted Sucessfully............");
			}else {
				System.err.println("Data not deleted");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ConnTest conn=new ConnTest();
		while(true) {
			IO.println("1) Show table");
			IO.println("2) Insert data");
			IO.println("3) Delete Data Using Employee id");
			IO.println("4) Update Employee Data using employee id");
			IO.println("5) Exit");
			int choice=Integer.parseInt(IO.readln("Enter your choice.."));
			switch(choice) {
			case 1->{
				conn.getDetails();
			}
			case 2->{
				conn.insertData();
			}
			case 3->{
				conn.deleteData();
				
			}
			default -> System.err.println("Invalid choice");
			};
		}
	}
}
