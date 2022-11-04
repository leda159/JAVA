package ex08;

public class VIPCustomer extends Member {

	//적립액 7% 주문할인금액 5%
	public VIPCustomer(String name, int orderAmt) {
		super(name,orderAmt);
		grade = "VIP";//등급
		bonusRatio = 0.07;//적립율
	}

	@Override
	public void calcPrice() {
		
		//VIP 적립액 계산
		bonusPoint = (int)(orderAmt * bonusRatio );
		//VIP 고객은 주문금액에서 5% 할인
		orderAmt = orderAmt - (int)(orderAmt * 0.05);
	}
}
