package day1027;

public class CastingExample {
	public static void main(String[] args) {

		//강제타입변환?
		//큰 범위의 값을 작은 범위의 값에 대입하기 위해
		//캐스팅(형변환)으로 처리
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println("charValue:" + charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println("intValue:" + intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println("intValue:" + intValue);
		
	}

}
