package string_logical_question;

import java.util.Scanner;

/*Write a method to find the maximum occurring character in a given String 
with frequency. 
Method name : maxOccurance 
Argument : String 
Return Type : String 
Example1 
input String : "javaaavvaba" 
output : a = 6 time 
Example2 
input String : "javav" 
output : a = 2 time 
v = 2 time 
Example3 
input String : "abc" 
output : a = 1 time 
b = 1 time 
c = 1 time 
NOTE : If input String is null or empty then return "invalid String 
input".*/
public class FindMaximumOccurringCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		char arr1[] = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 1;
				}
			}
			System.out.println(arr[i] + " : " + count);
		}
	}
}
