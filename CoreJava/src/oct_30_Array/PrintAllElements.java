package oct_30_Array;
/*Que 2:
=======
Write a java program to Print all elements in reverse order of an Array.

Input as: 1 2 3 4 5
Output as: 5 4 3 2 1

----------------------------*/
import java.util.Scanner;
public class PrintAllElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter array of element");
		int arr[]=new int[size];

		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
