package day1028;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
	
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
		
		int v2 = 1;
		double v3 = 1.0;
		//v2는 정수형 변수이지만 자동 형변환이 발생하여
		//v2의 값은 1.0이 된다.
		System.out.println(v2 == v3);//true
		
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);//false
		System.out.println((float)v4 == v5);//true

	}

}
