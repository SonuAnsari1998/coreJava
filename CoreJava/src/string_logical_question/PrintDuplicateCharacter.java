package string_logical_question;

import java.util.Scanner;

/*Program : 3 
Write a method to print the duplicate characters from the given String in 
sorted order. 
Method name : returnDuplicateCharacters 
Argument : String 
Return Type : String 
Example  
input String : "javavaavvaba" 
output : "aaaaaavvvv" 
NOTE : If input String is null or empty then return "invalid String 
input". */
public class PrintDuplicateCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente a String");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			boolean isTrue=false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					isTrue=true;
					break;
				}
			}
			if(isTrue) System.out.print(arr[i]);
		}
	}
}
