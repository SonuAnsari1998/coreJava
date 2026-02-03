package feb_03_2026_Collection_WHM_IHM_PriorityQueue;

import module java.base;
/*Assignment 02 :
--------------
Write a program to show the internal working of IdentityHashMap in comparison to HashMap.
*/
public class InternalWorkingIdentityHashMap {
	void main() {
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		map1.put(101, "Sonu");
		map2.put(101, "Sonu");
		System.out.println(map1.hashCode()+" "+map2.hashCode());
		
		
		Map<Integer, String> map3 = new IdentityHashMap<>();
		Map<Integer, String> map4 = new IdentityHashMap<>();
		map3.put(101, "Sonu");
		map4.put(101, "Sonu");
		System.out.println(map3.hashCode()+" "+map4.hashCode());
		
		
	}
}
