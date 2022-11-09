package ex01;

public class StringEqualsExample {
	public static void main(String[] args) {

		// strVar1 > 스택메모리에 생성됨
		// new String >Heap 메모리에 생성됨
		String strVar1 = new String("홍길동");
		//리터럴방식(liternal)
		String strVar2 = "홍길동";
		
		//주소값을 비교함
		//주소값이 다르다.
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//equals문자열을 비교함
		//문자열이 같다.
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
