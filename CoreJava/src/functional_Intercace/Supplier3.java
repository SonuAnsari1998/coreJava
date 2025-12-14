package functional_Intercace;

import java.util.function.Supplier;
 
record Driver(String name, Integer id, Double Salary) {
	
}

public class Supplier3 {
	void main() {
		Supplier <Driver> driver=()->{
			String name=IO.readln("Enter Driver Name");
			int id =Integer.parseInt(IO.readln("Enter Driver ID"));
			double salary =Double.parseDouble(IO.readln("Enter Driver ID"));
			return new Driver(name, id, salary);
		};
		IO.println(driver.get());
	}
}
