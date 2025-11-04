package nov_04_2025;
/*2. FrequencyOfElements

Problem Description
Write a Java program to find the frequency of each element present in the given array.
Each unique element should be displayed once along with its frequency count.

Input Format:

First line: Integer n representing the number of elements in the array

Second line: n integers separated by spaces

Output Format:

Display each element and its frequency in the following format:
Element: x, Frequency: y

Examples
Example 1
Input:
7
1 2 2 3 3 3 4
Output:
Element: 1, Frequency: 1
Element: 2, Frequency: 2
Element: 3, Frequency: 3
Element: 4, Frequency: 1
*/

	import java.util.*;
	public class FrequencyOfElements {
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        if(size<=0){
	            System.out.println("Invalid Array Size");
	            System.exit(0);
	        }
	        int arr[]=new int[size];
	        for(int i=0;i<size; i++){
	            arr[i]=sc.nextInt();
	        }
	            boolean visited[]=new boolean[size];
	            for(int i=0; i<size;i++){
	                if(visited[i]==false){
	                    int count = 1;
	                    for(int j=i+1; j<size; j++){
	                        if(arr[i]==arr[j]){
	                            count++;
	                            visited[j]=true;
	                        }
	                    }
	                    System.out.println("Element: "+arr[i]+ ", Frequency: "+count);
	                }
	            }
	        }
	    }
