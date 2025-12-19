package dec_19_2025_equals_Object_obj_method_Exception;

public class ProductEquality {
	void main() {
		Product p1 = new Product(111, "Laptop");
		Product p2 = new Product(111, "Laptop");

		if (p1.equals(p2)) {
			IO.println("true");
		} else {
			IO.println("False");
		}
	}
}
