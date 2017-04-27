package ajou.oop.lab07;

public abstract class Product {

	private double price;
	public Product() {
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract String getName(String name);
}
