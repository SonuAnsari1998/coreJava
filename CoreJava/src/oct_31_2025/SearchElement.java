package oct_31_2025;
/*1. SearchElement

Problem Description
Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
    
Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found


Enter number of elements: 7
Enter 7 elements:
1
4
3
5
2
6
5

Enter the element to search: 5
Element found at index: 3

Test Case 1:-
7  //-> Array Size
1
4
3
5
2
6
5
5  //->element to search: 5

Expected Output :-

Element found at index: 3

Examples
Example 1
Input:
7
1
4
3
5
2
6
5
5
Output:
Element found at index: 3*/
import java.util.*;
class SearchElement{
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
        int find=sc.nextInt();
        int index=0;
        boolean isExist=false;
        for(int i=0; i<size; i++){
            if(arr[i]==find){
                index=i;
                isExist=true;
                break;
            }
        }
        if(isExist){
            System.out.print("Element found at index: "+index);
        }
    }
}
