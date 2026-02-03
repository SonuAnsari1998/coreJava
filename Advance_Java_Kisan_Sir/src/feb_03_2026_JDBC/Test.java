package feb_03_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

public class Test {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";
	

//connection 
	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
//---------------
	public void batchProcessing() {
		Connection conn=connect();
		try {
			Statement prep1 = conn.createStatement();
			int noOfQuery=Integer.parseInt(IO.readln("How many query you want to add the batch"));
			for(int i=1; i<=noOfQuery; i++) {
				System.out.println("Enter your "+i+" qury");
				prep1.addBatch(IO.readln());
				
			}
			System.out.println(noOfQuery+ " ");
			int[] rowCount = prep1.executeBatch();
			System.out.println("==> "+Arrays.toString(rowCount));
			prep1.clearBatch();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Test t= new Test();
		t.batchProcessing();
	}
}
