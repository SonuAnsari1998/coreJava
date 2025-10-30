package oct_30_Array;
/*Que 3 :
=======
Write a java program to add the last and first element of a given array.

Input as: [1,2,3,4,5,6]   
Output as: 7

----------------------------*/
import java.util.Scanner;
public class AddLastAndFirstElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		System.out.println("Enter Array element");
		int arr[]=new int[size];
		for (int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int first=arr[0];
		int last=arr[arr.length-1];
		System.out.println("Adding of First and Last Element: "+(first+last));
	}

}
