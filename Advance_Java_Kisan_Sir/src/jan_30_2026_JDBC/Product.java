package jan_30_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
	

	public static void main(String[] args) {

		IO.println("1.Insert productdetails into product table.\n" + "2.Retrieve productdetails in forward direction.\n"
				+ "3.Retrieve productdetails in reverse direction.\n" + "4.Retrieve 3rd record from top.\n"
				+ "5.Retrieve 3rd record from bottom.\n" + "6.Retrieve last three record from product table.");
		int choice = Integer.parseInt(IO.readln("Enter your choice...."));
		Product p = new Product();
		p.InsertProductdetails();

	}
}
