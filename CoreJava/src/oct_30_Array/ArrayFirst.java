/*Write a java program to to store 5 integer value into array and print it

Input as : int arr[] = {1,2,3,4,5}
Output : 1 2 3 4 5*/
package oct_30_Array;
import java.util.Scanner;
public class ArrayFirst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}


