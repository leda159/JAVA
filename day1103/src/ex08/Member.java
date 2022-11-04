package ex08;

public  class Member {

	public String id;
	public String name;
	public String grade;//고객등급(silver,vip,gold)
	public int orderAmt;//주문금액
	public int bonusPoint;//적립액
	public double bonusRatio;//적립율
	
	//생성자 선언(클래스가 시작될때 초기화를 담당)
	public Member(String name, int orderAmt){

		this.name = name;
		this.orderAmt = orderAmt;
		this.grade = "SILVER"; // 등급은 최초에 SILVER 적용
		this.bonusRatio =0.05;//적립율 SILVER 적용
	}
	
	//적립금액 계산 & 주문금액 계산 처리 메서드
	public  void calcPrice() {
		//적립액 계산
		bonusPoint = (int)(orderAmt * bonusRatio );
		
	}
	
	//주문 내역 출력
	public  void memberInfo() {
		//적립액 계산 메서드
		calcPrice();
		
		System.out.printf("%s님 고객등급은 %s이고 할인적용된 주문금액 "
				+ "%,d원, 적립금액은 %,d원 입니다.\n"
				,name,grade,orderAmt,bonusPoint);
	};
	
}





