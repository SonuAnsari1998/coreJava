package com.pack1;

//1. Retrive the Employee details 
//2. Ask the user to enter Emp data and inset that data into employee table.
//3. Ask the user to enter eid and retrive that employee record for the database. if the record is 	       	not availble display that msg the consol inccluding Empid 
//4. ASk the user to enter eid and delete that employee record 
//5. ASk the user to enter eid and esal and update that record in the table accordingly.
import java.sql.*;
public class JDBCPro3 {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userName = "c##sonu";
	String password = "sonu";
	public Connection connection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//-------------Display Data--s--------
		public void getData() {
			try {
				Connection conn=connection();
				Statement stm=conn.createStatement();
				ResultSet rest=stm.executeQuery("Select * from Employee");
				while(rest.next()) {
					IO.println(rest.getInt(1)+"\t"+rest.getString(2)+"\t"+rest.getString(3)+"\t"+rest.getDouble(4)+"\t\t"+rest.getString(5));
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
// --------Insert Data into Table------------------
		public void InserData() {
			try {
				Connection conn=connection();
				Statement stm=conn.createStatement();
				String id =IO.readln("Enter Employee Da");
				int row=stm.executeUpdate("INSERT INTO EMPLOYEE VALUES ('122','sonu', 'Ansari', 50000, 'Ranchi')");
				if(row==0) {
					IO.println("Not Inserted Data");
				}else {
					IO.println("Insted Successfully..........");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

//3. Ask the user to enter eid and retrive that employee record for the database. if the record is 	       	
//   not availble display that msg the consol inccluding Empid 
		public void retriveData() {
			try {
				Connection conn=connection();
				Statement stm=conn.createStatement();
				IO.println("---------Display data on the basis of id------------\n");
				int id= Integer.parseInt(IO.readln("Enter Employee id"));
				ResultSet rest=stm.executeQuery("Select * from Employee where eid="+id);
				while(rest.next()) {
					if(rest.getInt(1)==id) {
						IO.println(rest.getInt(1)+"\t"+rest.getString(2)+"\t"+rest.getString(3)+"\t"+rest.getDouble(4)+"\t\t"+rest.getString(5));
					}
				}	
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
//4. ASk the user to enter eid and delete that employee record 
		public void deletData() {
			try {
				Connection conn=connection();
				Statement stm=conn.createStatement();
				IO.println("----------Delete------------\n");
				int id= Integer.parseInt(IO.readln("Enter Employee id"));
				int row =stm.executeUpdate("delete from Employee where eid="+id);
				if(row==0) {
					IO.println(id+" is not deleted");
				}else {
					IO.println(id+" is Deleted sucessfullyy................");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
//5. ASk the user to enter eid and esal and update that record in the table accordingly.
		public void updateSal() {
			try {
				Connection conn=connection();
				Statement stm=conn.createStatement();
				IO.println("----------Update Salary on the basis of id------------\n");
				int id= Integer.parseInt(IO.readln("Enter Employee id"));
				double salary=Double.parseDouble(IO.readln("Enter Employee salary"));
				
				int row =stm.executeUpdate("update Employee set esal=" + salary + "where eid=" + id);
				if(row==0) {
					IO.println(id+" is not deleted");
				}else {
					IO.println(id+" is Deleted sucessfullyy................");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	
	
//-----------main----------
	void main() {
		JDBCPro3 jdbc=new JDBCPro3();
		
		
			jdbc.connection();
			jdbc.getData();
			jdbc.retriveData();
			jdbc.deletData();
			jdbc.InserData();

	}
}
