package oct_31_2025;
/*6. PrintElementPresentOnEvenIndex
 * 
Problem Description
Write a Java program to print all the elements of an array that are located at even index positions (i.e., index 0, 2, 4, ...).
Example :
input   : [1,2,3,4,5,6]
output :  1 3 5 

Testcase 1:-
Enter number of elements: 6
Enter 6 integers:
1
2
3
4
5
6

Expected Output :-

Elements at even index positions:
1 3 5 

Examples
Example 1
Input:
6
1
2
3
4
5
6
Output:
Elements at even index positions:
1 3 5*/
import java.util.*;
class PrintElementPresentOnEvenIndex{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("Invalid Array size.");
            System.exit(0);
        }
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements at even index positions:");
        for(int i=0; i<size; i++){
            if(i%2==0)
                System.out.print(arr[i]+" ");
        }
    }
}