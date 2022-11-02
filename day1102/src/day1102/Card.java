package day1102;

public class Card {
	//필드
	public String name;//고객명
	public int cardAmt;//결제금액
	public int pointAmt;//적립액
	
	//생성자
	public Card(String name, int cardAmt) {
		this.name = name;
		this.cardAmt = cardAmt;
	}

	//적립액 계산
	public int getPonint() {
		pointAmt = (int)(cardAmt * 0.03); //3프로 적립
		return pointAmt;
	}

	//결제 상세내역 출력 메서드
	public void pointInfo() {
		System.out.printf("%s님 구매금액:%,d원 포인트 적립액:%,d원\n",name,cardAmt,getPonint());
	}
	
}
