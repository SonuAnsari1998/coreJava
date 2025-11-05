package nov_05_Custom_Object_with_array;
/*Create a BLC class called Product.

Attributes/Properties/Fields [tightly encapsulated]

id, name and price

Take a parameetrized constructor to initialize all the fields.

Take getter method for id field.

Generate toString() method.*/
public class Product {
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "price=" + price + "]";
	}
	
	
}
