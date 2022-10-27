package day1027;

public class PromotionExample {

	public static void main(String[] args) {
		
		
		//자동타입 변환
		//값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로
		//저장되는 것을 말함
		// byte < short < int < long < float < double
		
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue:" + doubleValue);

	}

}
