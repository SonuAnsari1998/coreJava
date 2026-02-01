package stream_API_Logical_Program;

import java.util.Arrays;

//5) WAP to filter all the prime number from the given array.
public class FindPrimeNumber {
	public static void main(String[] args) {
		int arr[]= {2, 3, 5, 7,4, 6, 8, 9};
		int primeNumber[] = Arrays.stream(arr)
	            //.filter(num -> FindPrimeNumber.isPrime(num))
	            .toArray();
		
	}


	
	

	
}
