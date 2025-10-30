package oct_30_Array;

/*Que 4:
=======

Write a java program to print all even elements and odd elements separately from an array.

Input as  : 1 2 3 4 5 6 7
Output as:
Even elements are : 2 4 6
Odd elements are : 1 3 5 7

----------------------------*/
import java.util.Scanner;

public class PrintAllEvenElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		System.out.println("Enter element of array");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Even Element : ");
		for(int i=0; i<size; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\nOdd Element : ");
		for(int i=0; i<size; i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
