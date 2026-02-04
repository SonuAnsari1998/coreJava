package feb_04_2026_Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Assignment : Q3
----------------
Take an int array with 7 elements, sort the array in reverse order by using sorted() method.

Output :
Sorted array in reverse order: [9, 8, 7, 5, 3, 2, 1]
*/
public class ShortArrayReverseOrder {
	public static void main(String[] args) {
		int arr[] = { 9, 8, 7, 5, 3, 2, 1 };

		List<Integer> revSort = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(revSort);
	}
}
