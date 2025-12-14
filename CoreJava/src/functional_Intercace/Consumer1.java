package functional_Intercace;

import java.util.function.Consumer;

record Product(Integer productId, String productName, Double price) {

}

public class Consumer1 {
	void main() {
		Consumer<Integer> c1 = num -> IO.println(num);
		c1.accept(12);
		
		Consumer <Double> c2= price->IO.println(price);
		c2.accept(555D);
		
		Consumer<String> c3=name->IO.println(name);
		c3.accept("Sonu");

		Consumer<Product> p1 = prod -> IO.println(prod);
		p1.accept(new Product(111,"Laptop", 5500D));
	}
}
