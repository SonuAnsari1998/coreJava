package functional_Intercace;

import java.util.function.Function;

//find our the length of city using funcion 
public class Function1 {
	void main() {
		Function<String, Integer> c1 = str -> str.length();
		String cityNam=IO.readln("Enter your city name");
		IO.println(c1.apply(cityNam));
	}
}
