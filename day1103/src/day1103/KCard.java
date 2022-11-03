package day1103;

public class KCard extends Card {

	public KCard(String name, int orderAmt) {
		super(name, orderAmt);
		
	}

	@Override
	public void orderInfo() {
		//할인적용금액 1 - 0.95 = 7% 
		int disAmt =(int)(orderAmt*0.93);
			System.out.printf("%s님 주문금액 %,d에서 할인된 적용금액은 %,d 입니다.\n",name,orderAmt,disAmt);
	}


	
}
