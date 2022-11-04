package ex08;

public class GoldCustomer extends Member {

	//적립액 10% 주문할인금액 10%
	public GoldCustomer(String name,int orderAmt) {
		super(name, orderAmt);
		grade = "Gold";//등급
		bonusRatio = 0.1;//적립율
	}

	@Override
	public void calcPrice() {
		
		//VIP 적립액 계산
		bonusPoint = (int)(orderAmt * bonusRatio );
		//VIP 고객은 주문금액에서 5% 할인
		orderAmt = orderAmt - (int)(orderAmt * 0.1);
	}
}
