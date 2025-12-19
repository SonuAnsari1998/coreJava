package dec_19_2025_equals_Object_obj_method_Exception;

import java.util.Objects;

public class Product extends Object {
	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj.getClass() == this.getClass()) {
			return true;
		}
		Product product = (Product) obj;
		if (this.productId == product.productId && this.productName == product.productName) {
			return true;
		}
		if (this.hashCode() == product.hashCode()) {
			return true;
		}
		return false;
	}
}
