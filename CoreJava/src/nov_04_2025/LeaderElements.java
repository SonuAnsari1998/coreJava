package nov_04_2025;
/*3. LeaderElements

Problem Description
An element is called a leader if it is greater than all the elements to its right side.
Write a Java program to print all leader elements in the given array.

Input Format:

First line: Integer n representing number of elements

Second line: n integers separated by spaces

Output Format:

Display leader elements separated by spaces.

Examples
Example 1
Input:
6
16 17 4 3 5 2
Output: 
Leader elements are: 17 5 2*/

	import java.util.*;
	public class LeaderElements {
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        int arr[]=new int[size];
	        for(int i=0; i<size; i++){
	            arr[i]=sc.nextInt();
	        }

	        System.out.print("Leader elements are: ");

	        for(int i=0; i<size; i++){
	            boolean isLeader=true;

	        for(int j=i+1; j<size; j++){
	            if(arr[i]<= arr[j]){
	            isLeader=false;
	            break;
	            }
	        }
	        if(isLeader){
	            System.out.print(arr[i]+" ");
	        }
	    }
	}
	}
