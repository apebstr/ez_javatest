package ncs.test04;

public class Product {

	private String name;
	private int price;
	private int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String information() {
		
		return String.format("상품명 : %s%n가격 : %s원%n수량 : %s개%n총 구매 가격 : %d원%n"
				, getName(), String.valueOf(getPrice()), String.valueOf(getQuantity()), getPrice()*getQuantity());
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
	
}
