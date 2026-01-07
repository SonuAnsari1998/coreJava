package jan_06_2026_Collection_List_Interface;

import java.util.ArrayList;

/*1. Create an ArrayList<Integer> and perform the following operations:
   - Add 5 integers
   - Insert an element at index 2
   - Remove one element by value
   - Display the final list*/

import java.util.Arrays;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2,7);
		list.remove(Integer.valueOf(4));
		System.out.println(list);
	}
}
