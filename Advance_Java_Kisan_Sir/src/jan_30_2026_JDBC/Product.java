package jan_30_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Product {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	Connection connect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

//1.Insert productdetails into product table.
	public void InsertProductdetails() {
		Connection conn = connect();
		try {
			PreparedStatement prep = conn.prepareStatement("insert into Product5 values (?, ?, ?, ?)");
			int id = Integer.parseInt(IO.readln("Enter Product id"));
			String productName = IO.readln("Enter Product Name");
			double price = Double.parseDouble(IO.readln("Enter Product Price"));
			int qty = Integer.parseInt(IO.readln("Enter Quantity.."));

			prep.setInt(1, id);
			prep.setString(2, productName);
			prep.setDouble(3, price);
			prep.setInt(4, qty);
			int executeUpdate = prep.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println(id + " Data Added Sucessfully.....");
			} else {
				System.err.println("Something Wrong..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//2.Retrieve productdetails in forward direction.
	public void retriceForwardDirection() {
		Connection conn=connect();
		try {
			PreparedStatement prep =conn.prepareStatement("Select * from Product5");
			ResultSet rest=prep.executeQuery();
			System.out.println("PRODUCTID\tPRODUCTNAME\t\tPRODUCTPRICE\t\tPRODUCTQTY");
			while(rest.next()) {
				System.out.println(rest.getInt(1)+"\t\t"+rest.getString(2)+"\t\t\t"+rest.getDouble(3)+"\t\t\t"+rest.getInt(4));
			}
			System.out.println();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//3.Retrieve productdetails in reverse direction.
	public void retriveReverseDirection() {
		Connection conn=connect();
		try {
			PreparedStatement prep =conn.prepareStatement("Select * from Product5",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rest=prep.executeQuery();
			System.out.println("PRODUCTID\tPRODUCTNAME\t\tPRODUCTPRICE\t\tPRODUCTQTY");
			rest.afterLast();
			while(rest.previous()) {
				System.out.println(rest.getInt(1)+"\t\t"+rest.getString(2)+"\t\t\t"+rest.getDouble(3)+"\t\t\t"+rest.getInt(4));
			}
			System.out.println();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//4.Retrieve 3rd record from top.
	public void retriveRowWise(int row) {
		Connection conn=connect();
		try {
			PreparedStatement prep =conn.prepareStatement("Select * from Product5",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rest=prep.executeQuery();
			System.out.println("PRODUCTID\tPRODUCTNAME\t\tPRODUCTPRICE\t\tPRODUCTQTY");
			while(rest.absolute(row)) {
				System.out.println(rest.getInt(1)+"\t\t"+rest.getString(2)+"\t\t\t"+rest.getDouble(3)+"\t\t\t"+rest.getInt(4));
				break;
			}
			System.out.println();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Product p = new Product();

		while(true) {
			IO.println("1.Insert productdetails into product table.\n" + 
			"2.Retrieve productdetails in forward direction.\n"+ 
			"3.Retrieve productdetails in reverse direction.\n" + 
			"4.Retrieve 3rd record from top.\n"+ 
			"5.Retrieve 3rd record from bottom.\n" + 
			"6.Retrieve last three record from product table.");
			int choice = Integer.parseInt(IO.readln("Enter your choice...."));
			switch(choice) {
			case 1->{
				p.InsertProductdetails();	
			}
			case 2->{
				p. retriceForwardDirection();
			}
			case 3->{
				p.retriveReverseDirection();
			}
			case 4->{
				int rowNo = Integer.parseInt(IO.readln("Enter row Number"));
				p.retriveRowWise(rowNo);
			}
			default -> System.err.println("Invalid choice....");
			}
		}
		

	}
}
