package feb_05_2026_Stream_API;

import java.util.stream.Stream;

/*Q1) WAP to remove Negative Numbers from an Integer Array.

    Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
   
    Output : Positive Numbers: [5, 10, 15]*/
public class RemoveNegativeNumbers {
	public static void main(String[] args) {
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		Stream.of(numbers).filter(n -> n>0).forEach(IO::println);;
		
	}
}
