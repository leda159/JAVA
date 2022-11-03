package ex08;

public class VIPCustomer extends Member {

	public VIPCustomer(String id, String name, String grade, int orderAmt, int bonusPoint, int bonusRatio) {
		super(id, name, grade, orderAmt, bonusPoint, bonusRatio);
		
	}

	@Override
	public void calcPrice() {
		
		super.calcPrice();
	}

	@Override
	public void memberInfo() {
		
		super.memberInfo();
	}

}
