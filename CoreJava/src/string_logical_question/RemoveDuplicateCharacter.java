package string_logical_question;

import java.util.Scanner;

/*Program : 2 RemoveDuplicateCharacter
Write a method to remove all duplicates character from a given string. 
Method name : removeDuplicateCharacters 
Argument : String 
Return Type : String 
Example  
input String : "javaaavvaba" 
output : "javb" 
NOTE : If input String is null or empty then return "invalid String 
input".*/
public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Stirng");
			String str = sc.nextLine();
			char arr[]=str.toCharArray();
			for(int i=0; i<arr.length; i++) {
				boolean isTrue=true;
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						isTrue=false;
						break;
				}
			}
				if(isTrue) System.out.print(arr[i]);
		}
	}
}
