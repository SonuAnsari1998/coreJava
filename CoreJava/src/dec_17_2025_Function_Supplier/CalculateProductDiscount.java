package dec_17_2025_Function_Supplier;

import java.util.function.Function;

public class CalculateProductDiscount {
	void main() {
		int id = Integer.parseInt(IO.readln("Enter Product ID: "));
		String name = IO.readln("Enter Product Name: ");
		double price = Double.parseDouble(IO.readln("Enter Product Price: "));
		Product product = new Product(id, name, price);
		Function<Product, Double> discountPrice = p -> {
			double discount;
			if (product.price() >= 5000) {
				discount = (10 * product.price()) / 100;
				return product.price() - discount;
			}
			discount = (5 * product.price()) / 100;
			return product.price() - discount;

		};
		IO.println("Final price of the product is : " + discountPrice.apply(product));
	}
}
