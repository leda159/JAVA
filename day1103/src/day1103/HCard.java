package day1103;

public class HCard extends Card {

	public HCard(String name, int orderAmt) {
		//name,orderAmt을 부모클래스로 전달함
		super(name, orderAmt);

	}

	@Override
	public void orderInfo() {
		//할인적용금액 1 - 0.95 = 5% 
		int disAmt =(int)(orderAmt*0.95);
			System.out.printf("%s님 주문금액 %,d에서 할인된 적용금액은 %,d 입니다.\n",name,orderAmt,disAmt);
	}

	
}
