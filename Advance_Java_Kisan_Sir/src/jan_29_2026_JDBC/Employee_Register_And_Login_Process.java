package jan_29_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee_Register_And_Login_Process {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

//connection
	Connection connect() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

//register
	public void register() {
		Connection conn = connect();
		try {
			PreparedStatement prt1 = conn.prepareStatement("INSERT INTO EMPLOYEEINFO VALUES (?, ?, ?, ?, ?, ?, ?)");
			PreparedStatement prt2 = conn.prepareStatement("SELECT ? FROM EMPLOYEEINFO WHERE EID=?");

			System.out.println("----Employee Registe and Login Process");
			while (true) {
				System.out.println("1. Register");
				System.out.println("2. Login");
				int choice = Integer.parseInt(IO.readln("Enter your choice..."));
				switch (choice) {
				case 1 -> {
					int eid = Integer.parseInt(IO.readln("Enter Employee id"));
					String name = IO.readln("Enter Emloyee Name");
					double esal = Double.parseDouble(IO.readln("Enter Salary"));
					String fname = IO.readln("Enter First Name");
					String lname = IO.readln("Enter Last Name");
					String email = IO.readln("Enter Email id");
					Long phone = Long.parseLong(IO.readln("Enter Mobile number.."));
					prt1.setInt(1, eid);
					prt1.setString(2, name);
					prt1.setDouble(3, esal);
					prt1.setString(4, fname);
					prt1.setString(5, lname);
					prt1.setString(6, email);
					prt1.setLong(7, phone);

					int rowCount = prt1.executeUpdate();
					System.out.println(rowCount);
					if (rowCount > 0) {
						System.out.println("Register Sucessfully........");
					} else {
						System.err.println("Invalid details.. Pls enter valid details");
					}
				}
				case 2 -> {
					int id = Integer.parseInt(IO.readln("Enter Employee id"));
					String name = IO.readln("Enter Employee Name");
					prt2.setString(1, name);
					prt2.setInt(2, id);
					ResultSet rst = prt2.executeQuery();
					while (rst.next()) {
						PreparedStatement prt3 = conn.prepareStatement("SELECT * FROM EMPLOYEEINFO");
						PreparedStatement prt4 = conn
								.prepareStatement("UPDATE  EMPLOYEEINFO SET MAILID=?, PHNO=? where eid=?");
						PreparedStatement prt5 = conn
								.prepareStatement("DELETE FROM EMPLOYEEINFO WHERE ESAL BETWEEN ? AND ?");
						PreparedStatement prt6 = conn
								.prepareStatement("DELETE FROM EMPLOYEEINFO WHERE ESAL BETWEEN ? AND ?");
						PreparedStatement prt7 = conn
								.prepareStatement("UPDATE EMPLOYEEINFO  SET esal = esal * 1.10");

						IO.println("\nLogin Successfully........");
						IO.println("Welcome " + rst.getString(1));
						IO.println();
						while (true) {
							IO.println("1. Show All Employee..");
							IO.println("2. Update Mail & Phone Number based on id..");
							IO.println("3. Delete Employees whose salary between 50000-70000");
							IO.println("4. Increse 10% salary of each employee");
							int ch = Integer.parseInt(IO.readln("Enter Your chocie"));
							switch (ch) {
							case 1 -> {
								ResultSet rst1 = prt3.executeQuery();
								IO.println("Employee Details....");
								IO.println("EID\tENAME\tESAL\tFNAME\tLNAME\tMAILID\tPHNO");
								while (rst1.next()) {
									IO.println(rst1.getInt(1) + "\t" + rst1.getString(2) + "\t" + rst1.getDouble(3)
											+ "\t" + rst1.getString(4) + "\t" + rst1.getString(5) + "\t"
											+ rst1.getString(6) + "\t" + rst1.getLong(7));
								}
							}
							case 2 -> {
								int eid = Integer.parseInt(IO.readln("Enter Employee id"));
								String email = IO.readln("Enter Email id");
								Long phone = Long.parseLong(IO.readln("Enter Mobile number.."));
								prt4.setString(1, email);
								prt4.setLong(2, phone);
								prt4.setInt(3, id);
								int rowCount = prt4.executeUpdate();
								if (rowCount > 0) {
									System.out.println(eid + " Data Updated sucessfully.......");
								} else {
									System.err.println(eid + " Not Found..");
								}

							}
							case 3 -> {
								double esal1 = Double.parseDouble(IO.readln("Enter Salary Range Start"));
								double esal2 = Double.parseDouble(IO.readln("Enter Salary Range End"));
								prt5.setDouble(1, esal1);
								prt5.setDouble(2, esal2);
								int rowCount = prt5.executeUpdate();
								if (rowCount > 0) {
									System.out.println(esal1 + " to " + esal2 + " Deleted Sucessfully.....");
								} else {
									System.err.println(esal1 + " to " + esal2 + " Range Salary Not Found...");
								}

							}
							case 4->{
								int rowCount = prt7.executeUpdate();
								if(rowCount>0) {
									System.out.println("10% Salary Added Sucessfully...");
								}
							}

							default -> System.err.println("Invalid choice.. ");
							}
						}
					}
				}

				default -> System.err.println("Invalid choice... Please Enter valid choice");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Employee_Register_And_Login_Process e1 = new Employee_Register_And_Login_Process();
		e1.connect();
		e1.register();
	}
}
