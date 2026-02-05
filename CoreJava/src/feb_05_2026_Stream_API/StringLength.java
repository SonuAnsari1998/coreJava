package feb_05_2026_Stream_API;

import java.util.stream.Stream;

/*Q4) WAP to print all the names from String array where the length of the 
    name must be greater than 3. 

    String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
    Output : [Rohit, Smirti, Richa]*/
public class StringLength {
	public static void main(String[] args) {
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		Stream.of(words).filter(n -> n.length()>3).forEach(IO::println);
	}
}
