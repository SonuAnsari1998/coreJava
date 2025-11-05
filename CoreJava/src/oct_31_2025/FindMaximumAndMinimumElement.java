package oct_31_2025;
/*4. FindMaximumAndMinimumElement
 * 
Problem Description
Write a Java program to find and print the maximum and minimum elements from an integer array.
Example :
input   : [5,3,1,3,9,7,6]

output :
MIN = 1 
MAX = 9

Testcase 1:-
Enter number of elements: 5
Enter 5 integers:
1
2
3
4
5

Expected Output:-

MIN = 1
MAX = 5

Examples
Example 1
Input:
5
1
2
3
4
5
Output:
MIN = 1
MAX = 5*/
import java.util.Scanner;
class FindMaximumAndMinimumElement{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("Array size must be greater than 0.");
            System.exit(0);
        }
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<size; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MIN = "+min);
        System.out.print("MAX = "+max);

    }
}
























