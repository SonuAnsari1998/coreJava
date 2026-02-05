package feb_05_2026_Stream_API;

import java.util.Arrays;
import java.util.stream.Stream;

/*Q2) WAP to print all the names from String array which containsCharacter 
    letter 'a' in the name.

    String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
    Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]*/
public class ContainsCharacter {
	public static void main(String[] args) {
		String[] namesList = { "Rahul", "Raj", "Arnav", "Scott", "Smith" };

		Arrays.stream(namesList).filter(n -> (n.contains("A") || n.contains("a"))).forEach(IO::println);

	}
}
