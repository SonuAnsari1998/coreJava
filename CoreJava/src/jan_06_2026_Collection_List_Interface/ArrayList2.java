package jan_06_2026_Collection_List_Interface;
/*2. Write a program to traverse an ArrayList<String> using:
   - for loop
   - enhanced for loop
   - Iterator
*/
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		list.add("papaya");
		list.add("Orange");
		list.add("Graps");
		
		System.out.println("Using for loop");
		for ( int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println("\n\nUsing loop");
		for(String li:list) {
			System.out.print(li+" ");
		}	
		System.out.println("\n\nUsing Iterator");
		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
	}
}
