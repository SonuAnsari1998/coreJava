package feb_05_2026_Stream_API;
/*Q5) WAP to print all the unique numbers from the Array.


    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
    Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]*/

import java.util.List;
import java.util.stream.Stream;

public class PrintUniqueNumber {
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
		List<Integer> list = Stream.of(numbers).distinct().toList();
		IO.print("Unique Numbers: ");
		for(Integer i:list) {
			IO.print(i+" ");
		}
	}
}
