package nov_04_2025;
/*4. RemoveDuplicateElements

Problem Description
Write a Java program to remove duplicate elements from a given array and display the resulting array with only unique elements.

Input Format:

First line: Integer n representing the number of elements in the array

Second line: n integers separated by spaces

Output Format:

Display the array after removing duplicates.

Examples
Example 1
Input:
8
1 2 2 3 4 4 5 5
Output:
Array after removing duplicates: [1, 2, 3, 4, 5]*/

	import java.util.*;
	public class RemoveDuplicateElements {
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);

	        int size=sc.nextInt();
	        if(size<=0){
	            System.out.print("Invalid Array Size");
	            System.exit(0);
	        }
	        int arr[]=new int[size];

	        for(int i=0; i<size; i++){
	            arr[i]=sc.nextInt();
	        }
	        Arrays.sort(arr);

	        int newArr[]=new int[size];
	        int index=0;

	        for(int i=0; i<size; i++){
	            if(i==0 || arr[i] != arr[i-1]){
	                newArr[index]=arr[i];
	                index++;
	            }
	        }
	    System.out.print("Array after removing duplicates: [");
	    for(int i=0; i<index; i++){
	        System.out.print(newArr[i]);
	        if(i<index-1)
	            System.out.print(", ");
	    }
	        System.out.print("]");
	}
	}
