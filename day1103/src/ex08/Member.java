package ex08;

public  class Member {

	public String id;
	public String name;
	public String grade;//고객등급
	public int orderAmt;//주문금액
	public int bonusPoint;//적립액
	public int bonusRatio;//적립율
	
	public Member(String id, String name, 
				  String grade, int orderAmt, 
				  int bonusPoint, int bonusRatio) {

		this.id = id;
		this.name = name;
		this.grade = grade;
		this.orderAmt = orderAmt;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}
	
	public  void calcPrice() {
		
	};
	public  void memberInfo() {
		
	};
	
}





