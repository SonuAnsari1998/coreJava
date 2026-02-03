package feb_02_feb_2026_JDBC_io_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

	public void insertImage() {
		Connection conn = connect();
		try {
			PreparedStatement prep1 = conn.prepareCall("insert into mydata values (?,?)");
			prep1.setString(1, "100");
			FileInputStream fis = new FileInputStream("F:\\img.png");
			prep1.setBlob(2, fis, fis.available());
			int rowCount = prep1.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Image Inserted Sucessfully.......");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void retriveImage() {
		Connection conn = connect();
		try {
			PreparedStatement prep2 = conn.prepareCall("select PIC_DATA  from mydata where id=?");
			prep2.setString(1, "100");
			ResultSet rs = prep2.executeQuery();
			if (rs.next()) {
				Blob b = rs.getBlob(1);
				byte arr[] = b.getBytes(1, (int) b.length());
				FileOutputStream fos = new FileOutputStream("F:\\\\img2.png");
				fos.write(arr);
				System.out.println("Image Retrived........");

			}else {
				System.err.println("image not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Test t1 = new Test();
		//t1.insertImage();
		t1.retriveImage();
	}
}
