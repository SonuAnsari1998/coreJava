package functional_Intercace;

import java.util.function.Supplier;

public class Supplier1 {
	void main() {
		Supplier<String> s1= ()->"Sonu";
		IO.println(s1.get());
	}
}
