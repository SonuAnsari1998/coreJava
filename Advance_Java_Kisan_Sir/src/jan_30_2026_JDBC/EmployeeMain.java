package jan_30_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
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

	public ArrayList<Employee> retrive() {

		ArrayList<Employee> employeeList = new ArrayList<>();
		try {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement("select * from Employee1 where AGE>=25");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
				employeeList.add(emp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	public static void main(String[] args) {
		EmployeeMain emp = new EmployeeMain();
		ArrayList<Employee> retrive = emp.retrive();
		for (Employee e : retrive) {
			IO.println(e);
		}

	}
}
