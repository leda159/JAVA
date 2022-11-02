package day1102;

public class KCard extends Card {

	public KCard(String name, int cardAmt) {
		super(name, cardAmt);
	}

	@Override
	public int getPonint() {
		pointAmt = (int)(cardAmt * 0.05); //5프로 적립
		return pointAmt;
	}
}
