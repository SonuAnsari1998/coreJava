package oct_31_2025;
/*2. SortArray

Write a java program to sort the given array in ascending and descending order.[use switch case].
Example  :

CHOICE 1 : ASCENDING ORDER
input    : [3,5,6,1,9]
output   : [1,3,5,6,9]

CHOICE 2 : DESCENDING ORDER
input    : [3,5,6,1,9]
output   : [9,6,5,3,1]

Testcase 1:-
Enter number of elements: 5
Enter 5 integers:
2
5
4
8
6
Enter your choice:
1. Ascending Order
2. Descending Order
1

Expected Output:-

Sorted in Ascending Order: [2, 4, 5, 6, 8]

------------
Testcase 2:-

Enter number of elements: Enter 5 integers:
2
5
4
8
6
Enter your choice:
1. Ascending Order
2. Descending Order
2

Expected Output:-
---------------
Sorted in Descending Order: [8, 6, 5, 4, 2]
--------------------------------------

Examples
Example 1
Input:
5
2
5
4
8
6
1
Output:
Sorted in Ascending Order: [2, 4, 5, 6, 8]*/
import java.util.*;
class SortArray{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            if(size<=0){
                System.out.print("Invalid Array size.");
                System.exit(0);
            }
            int arr[]=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }
            int chose=sc.nextInt();
            if(chose==3){
                System.out.print("Invalid choice. Please select 1 or 2.");
                System.exit(0);
                
            }
            switch(chose){
                case 1->{
            Arrays.sort(arr);
            System.out.print("Sorted in Ascending Order: "+Arrays.toString(arr));
            }
            case 2->{
            Arrays.sort(arr);
            for(int i=0; i<size/2; i++){
                int temp=arr[i];
                arr[i]=arr[size-i-1];
                arr[size-i-1]=temp;
            }
            System.out.print("Sorted in Descending Order: "+Arrays.toString(arr));
            }
            default -> System.out.print("Invalid choice");
                }
            }
        }

