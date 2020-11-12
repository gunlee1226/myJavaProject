package day3;

//  부모 클래스
public class Goods {

	
	public String name;
	public int price;
	
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
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Goods() {}
	
		
	public void ShowInfo() {
			System.out.println(this.name + " " + this.price);
	}
}

	
