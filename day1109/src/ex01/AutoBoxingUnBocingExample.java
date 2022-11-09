package ex01;

public class AutoBoxingUnBocingExample {
	public static void main(String[] args) {
		
		//자동 박싱(100이 기본자료형이 Wrapper클래스 변환)
		//Integer obj = new Integer(100); //박싱
		Integer obj = 100;
		System.out.println("value:" + obj.intValue());
		
		//대입 시 자동 언박싱
		//언박싱 : Wrapper 클래스를 기본 자료형으로 변환
		int value = obj;
		System.out.println("value:" + value);
		
		//연산 시 자동 언박싱
		//자동 언박싱 처리
		int result = obj + 100;
		System.out.println("result:" + result);
	}
}
