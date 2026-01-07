package jan_06_2026_Collection_List_Interface;

import module java.base;

public class ArrayList5 {
	void main() {
		ArrayList <Integer> list= new ArrayList<>(100);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		IO.println(list.size()); // 4 100
		list.trimToSize(); // 4 4
        System.out.println("Size: " + list.size());

		
	}
}
