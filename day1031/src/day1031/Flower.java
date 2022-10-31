package day1031;

public class Flower {
	
	//필드
	String name;
	int cost;
	
	//생성자
	public Flower() {};
	
	public Flower(String name,int cost) {
		
		this.name = name;
		this.cost = cost;
	}
	
	//메서드
	public void flowerInfo() {
		System.out.printf("%s 한송이 가격은 %,d원 입니다.\n",name,cost);
	}


}
