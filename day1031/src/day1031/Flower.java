package day1031;

public class Flower {

	//필드
	public String name;//꽃이름
	public int cost;//가격
	
	public Flower() {} //기본생성자
	
	public Flower(String name,int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public void flowerInfo() {
		System.out.printf(
			"%s 꽃 한송이 가격은 %,d원 입니다.\n",name,cost);
	}
	
}




