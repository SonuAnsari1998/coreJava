package nov_04_2025;
/*5. CheckArrayIsEqualOrNot

Problem Description

Write a Java program to check whether two integer arrays are equal.
-> Two arrays are considered equal if:
   They have the same length & All elements at the same positions.

Example1 :
input    : 
arr1     : [1,2,3,4,5]
arr2     : [1,2,3,4,5]
output   : Equal


Example2 :
input    : 
arr1     : [1,2,3,4,5]
arr2     : [5,2,3,4,1]
output   : Not Equal


Example3 :
input    : 
arr1     : [2,3,1]
arr2     : [2,3,1,1]
output   : Not Equal

Testcase 1:- 
Enter number of elements in first array: 4
Enter elements of first array:
1
2
3
4
Enter number of elements in second array: 4
Enter elements of second array:
1
2
3
4

Expected Output :-


Equal


Examples
Example 1
Input:
4

1
2
3
4

4

1
2
3
4
Output: Equal*/

	import java.util.*;
	public class CheckArrayIsEqualOrNot {
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        int size1=sc.nextInt();
	        int arr1[]=new int [size1];
	        for(int i=0;i<size1;i++){
	            arr1[i]=sc.nextInt();
	        }
	        int size2=sc.nextInt();
	        int arr2[]=new int[size2];
	        for(int i=0; i<size2; i++){
	            arr2[i]=sc.nextInt();
	        }
	        boolean isTrue=true;
	        if(size1!=size2){
	            isTrue=false;
	        }else{
	        for(int i=0; i<size1;i++){
	        if(arr1[i]!=arr2[i]){
	            isTrue=false;
	            break;
	        }
	        }
	        }
	        if(isTrue){

	        System.out.print("Equal");
	        }else
	        System.out.print("Not Equal");
	    }
	}
