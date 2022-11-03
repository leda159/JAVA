package day1103;

public abstract class Card {

	public String name;
	public int orderAmt;
	
	
	public Card(String name, int orderAmt) {

		this.name = name;
		this.orderAmt = orderAmt;
	}
	
	//추상메서드
	//abstract : 예약어
	public abstract void orderInfo();
	
}
