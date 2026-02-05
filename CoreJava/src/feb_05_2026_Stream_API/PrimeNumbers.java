package feb_05_2026_Stream_API;

import java.util.stream.Stream;

/*Q3) WAP to print all the PrimeNumbers from an Integer Array.

    Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    Output : Prime Numbers: [2, 3, 5, 7, 11]*/
public class PrimeNumbers {
	public static void main(String[] args) {
		Integer[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		Stream.of(numbers).filter(n -> {
			boolean flag = true;
			for (int i = 2; i <= n / 2; i++)
				if (n % i == 0)
					flag = false;
			return flag;
		}).forEach(IO::println);
		;

	}
}
