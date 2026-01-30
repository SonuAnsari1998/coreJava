package jan_30_2026_Collection_TreeSet;
/*1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ProductMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(new Product(222, "Laptop"));
		listOfProduct.add(new Product(444, "Tablet"));
		listOfProduct.add(new Product(111, "Mobile"));
		listOfProduct.add(new Product(333, "Laptop"));

		IO.println("1) Sort based on the pid in ascending order.");
		TreeSet<Product> pid = new TreeSet<>(Comparator.comparingInt(p->p.id()));
		pid.addAll(listOfProduct);
		for (Product p : pid)
			IO.println(p);

		IO.println("\n2) Sort based on the pid in descending order.");
		TreeSet<Product> product1 = new TreeSet<>((p, q) -> q.id() - p.id());
		product1.addAll(listOfProduct);
		for (Product p : product1) {
			IO.println(p);
		}
		IO.println("\n3) Sort based on the name in Alphabetical order.");
		TreeSet<Product> pname = new TreeSet<>((p, q) -> p.name().compareTo(q.name()));
		pname.addAll(listOfProduct);
		for (Product p : pname) {
			IO.println(p);
		}
		IO.println("\n4) Sort based on the name in Reverse order.");
		TreeSet<Product> product2 = new TreeSet<>((p, q) -> p.name().compareTo(q.name()));
	}
}
