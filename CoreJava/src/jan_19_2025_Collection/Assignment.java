package jan_19_2025_Collection;

import java.util.LinkedList;

/**/
class Assignment{
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		
		LinkedList<Integer> li = new LinkedList<>(list); // li-list
		li.add(200); // li -200
		System.out.println(li); //list + 200
		
		
	}
}