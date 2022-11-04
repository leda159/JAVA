package day1104;

public class Flower {

	private String name;
	private int price;
	

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


	public void flowerInfo() {
		System.out.printf("꽃이름:%s,가격:%,d원\n",name,price);
	}
}
