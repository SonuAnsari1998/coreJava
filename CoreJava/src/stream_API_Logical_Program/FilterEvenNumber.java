package stream_API_Logical_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Filter Even numbers from collections with and without Stream API?
public class FilterEvenNumber {
	void main() {
		List<Integer> listofNumber = Arrays.asList(1, 3, 2, 4, 5, 7, 7, 8, 5, 6, 99);

		// with Collection
		System.out.println("Without Stream API");
		List<Integer> evenList = new ArrayList<>();
		for (Integer even : listofNumber) {
			if (even % 2 == 0) {
				evenList.add(even);
			}
		}
		evenList.forEach(IO::println);

		// with Steam API
		System.out.println("With Stream API");
		listofNumber.stream().filter(num->num%2==0).forEach(IO::println);
		
	}
}
