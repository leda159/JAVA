package day1028;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100; //100
		int result1 = +x; //-100
		//int result2 = -x; //100
		
		//x의 절댓값을 구한다10
		int result2 = Math.abs(x); 
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		
		byte b = 100;
		//byte resylt3 = -b;
		//byte 타입 값을 부호 연산하면 int 타입 값으로 바뀌므로 컴파일 에러 발생!
		//자동 타입 변환
		
		
		//
		int result3 = -b;
		System.out.println("result3:" + result3);
	}
}
