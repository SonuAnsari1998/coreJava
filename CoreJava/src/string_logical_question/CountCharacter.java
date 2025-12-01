package string_logical_question;
/*Program : 16 
Write a program to count the characters, digit, special characters from 
the given string. 
Method name : countCharacter 
Argument : String 
Return Type : String 
Example : 
input : "#NareshIt@123#" 
output :  
character : 8 
digit : 3 
special character : 3 
NOTE : If input String is null or empty then return "invalid String 
input".*/
import java.util.Scanner;
public class CountCharacter {
	public static String countCharacter(String str) {
		int digit=0;
		int character=0;
		int sCharacter=0;
		char arr[]=str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if((arr[i]>='A' && arr[i]<='Z')||(arr[i]>='a' && arr[i]<='z')) {
				character++;
			}else if(arr[i]>='0' && arr[i]<='9') {
				digit++;
			}else {
				sCharacter++;
			}
		}
		return "Digit : "+digit+
				"\nCharacter : "+character+
				"\nSpecial Character : "+sCharacter;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a any Character: ");
		String str=sc.nextLine();
		
		System.out.print(countCharacter(str));;
		
	}
}
