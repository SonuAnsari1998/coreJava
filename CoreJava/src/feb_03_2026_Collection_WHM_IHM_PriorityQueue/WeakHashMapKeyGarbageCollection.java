package feb_03_2026_Collection_WHM_IHM_PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/*Assignment 01 :
--------------
Write a program to show that WeakHashMap keys are weak in comparison to HashMap, if key is a 
reference key and it's value is set to be null.*/

record Employee(Integer id, String name, Double salary) {

}

public class WeakHashMapKeyGarbageCollection {
	void main() {
		Map<Employee, String> listofEmployee1 = new HashMap<>();
		Employee emp1 = new Employee(101, "Sonu", 55000D);
		listofEmployee1.put(emp1, "Hyd");
		
		
		Map<Employee, String> listofEmployee2 = new WeakHashMap<>();
		Employee emp2 = new Employee(102, "Allen", 75000D);
		listofEmployee2.put(emp2, "Ameerpet");
		
		
		
		emp1=null;
		emp2=null;
		
		System.gc();
		System.out.println(listofEmployee1);
		System.out.println(listofEmployee2);

	}
}
