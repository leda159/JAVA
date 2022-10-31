package day1031;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		
		//리터럴 방식으로 문자열 선언
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		//리터럴 방식으로 선언한 변수의 주소값 비교
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		//실제값을 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2 는 문자열이 같음");
		}
		
		//new 연산자
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		

		if(strVar3 == strVar4){	//주소값을 비교 false
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)){//true
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
