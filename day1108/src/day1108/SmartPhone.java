package day1108;

public class SmartPhone {

	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	//Object 의 toString()은 해시코드값을 리턴
	//String 객체형태의 toString()은 문자열을 리턴
	//하게 오버라이딩 처리
	@Override
	public String toString() {
		return company + "," + os;
	}
	
}




