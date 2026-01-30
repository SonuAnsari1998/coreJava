package jan_30_2026_Collection_TreeSet;

public record Product(Integer id, String name) {
	public Product{
		if(id<=0) {
			throw new IllegalArgumentException("Product id must be Possitive");
		}
	}
}
