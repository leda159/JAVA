package exam10;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

}
