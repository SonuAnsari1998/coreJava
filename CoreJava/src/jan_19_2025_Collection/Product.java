package jan_19_2025_Collection;

public class Product {
	int productId;
	String productName;
	double productPrice;
	int productQuantuty;

	public Product(int productId, String productName, double productPrice, int productQuantuty) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantuty = productQuantuty;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantuty() {
		return productQuantuty;
	}

	public void setProductQuantuty(int productQuantuty) {
		this.productQuantuty = productQuantuty;
	}

	@Override
	public String toString() {
		return "Product Details: \n"+"Product Id: "+this.productId+
				"\nProduct Name: "+this.productName+
				"\nProduct Price: "+this.productPrice+
				"\nProduct Quantity"+this.productQuantuty;
	}

}
