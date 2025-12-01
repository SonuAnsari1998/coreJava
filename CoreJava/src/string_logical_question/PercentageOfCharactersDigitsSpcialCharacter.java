package string_logical_question;

import java.util.Scanner;

/*Program : 17 
Write a program to find the the percentage of Characters,digits,special 
characters from the given String. 
Method name : percentageOfCharacters 
Argument : String 
Return Type : String 
Example : 
input : "Nacre@123%" 
output : 
character : 50.00% 
digit : 30.00% 
special character : 20.00% 
NOTE : If input String is null or empty then return "invalid String 
input". */
public class PercentageOfCharactersDigitsSpcialCharacter {
	public static String countCharacter(String str) {
		int digit=0;
		int character=0;
		int sCharacter=0;
		char arr[]=str.toCharArray();
		int total=arr.length;
		for(int i=0; i<arr.length; i++) {
			if((arr[i]>='A' && arr[i]<='Z')||(arr[i]>='a' && arr[i]<='z')) {
				character++;
			}else if(arr[i]>='0' && arr[i]<='9') {
				digit++;
			}else {
				sCharacter++;
			}
		}
		double pDigit=(digit*100.0)/total;
		double pchar=(character*100.0)/total;
		double pspy=(digit*100.0)/total;
		
		return "Digit : "+pDigit+"%"+
				"\nCharacter : "+pchar+"%"+
				"\nSpecial Character : "+"%"+pspy;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a any Character: ");
		String str=sc.nextLine();
		
		System.out.print(countCharacter(str));;
		
	}
}
