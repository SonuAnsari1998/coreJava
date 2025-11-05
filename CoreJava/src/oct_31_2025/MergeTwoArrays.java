package oct_31_2025;
/*5. MergeTwoArrays

Problem Description
Write a Java program to merge two integer arrays into a single new array. 
The merged array should contain all elements of the first array followed by all elements of the second array.

Example1 :
input :  
[1,2,3,4,5]
[6,7,8,9,10]

output : 
[1,2,3,4,5,6,7,8,9,10]


Example2 :
input :  
[1,2]
[10,20,30]

output : 
[1,2,10,20,30]

Testcase 1:-

Enter number of elements in first array: 3
Enter 3 elements of first array:
1
2
3
Enter number of elements in second array: 4
Enter 4 elements of second array:
4
5
6
7


Expected output:-
-----------------
Merged Array: [1, 2, 3, 4, 5, 6, 7]

-----------------
Testcase 2:-

Enter number of elements in first array: 2
Enter 2 elements of first array:
4
5
Enter number of elements in second array: 3
Enter 3 elements of second array:
1
2
3

Expected output:-
----------------
Merged Array: [4, 5, 1, 2, 3]

Examples
Example 1
Input:
3
1
2
3
4
4
5
6
7

Output:
Merged Array: [1, 2, 3, 4, 5, 6, 7]*/
import java.util.*;
class MergeTwoArray{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        if(size1<=0){
            System.out.println("Invalid Array size.");
            System.exit(0);
        }
        int arr1[]=new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i]=sc.nextInt();
        }

        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        for(int i=0; i<size2; i++){
            arr2[i]=sc.nextInt();
        }

        int[] merged=new int[size1+size2];

        for(int i=0; i<size1; i++){
            merged[i]=arr1[i];
        }
        for(int i=0; i<size2; i++){
            merged[size1+i]=arr2[i];
        }
        System.out.println("Merged Array: "+Arrays.toString(merged));
        
    }
}
