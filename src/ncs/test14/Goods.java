package ncs.test14;

public class Goods {
	
	private String name;
	private int price;
	private int quantity;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return String.format("%d", 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}//end of Goods
