package nov_04_2025;
/*1. Count_All_Digits

Problem Description
Write a Java program to count and display the total number of digits in each element of an array.

Input Format: 

First line: Integer n (size of array)

Second line: n integers separated by spaces

Output Format:

Display each element along with its digit count in the following format:
Number: x, Digits: y

Examples
Example 1
Input:
5
12 345 2 6789 56
Output:
Number: 12, Digits: 2
Number: 345, Digits: 3
Number: 2, Digits: 1
Number: 6789, Digits: 4
Number: 56, Digits: 2*/

import java.util.*;

class Count_All_Digits {
	public static void main(String[] arggs) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int digit = 0;
		for (int i = 0; i < size; i++) {
			digit = 0;
			int num = arr[i];
			int temp = num;
			while (num != 0) {
				num /= 10;
				digit++;
			}
			System.out.println("Number: " + temp + ", Digits: " + digit);
		}

	}
}
