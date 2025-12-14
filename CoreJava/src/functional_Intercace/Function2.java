package functional_Intercace;
import java.util.function.Function;
/*2️⃣ Create a program that takes a city name and uses Function<String, String> to convert it to uppercase.

Input: "Mumbai" → Output: "MUMBAI"*/
public class Function2 {
	void main() {
		Function<String,String> upper=name->name.toUpperCase();
		String cityName=IO.readln("Enter city name");
		IO.println(upper.apply(cityName));
	}
}
