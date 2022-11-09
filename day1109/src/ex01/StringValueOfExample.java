package ex01;

public class StringValueOfExample {

	public static void main(String[] args) {
		
		//기본 자료형을 문자열로 변환하는 메서드
		String str1 = String.valueOf(10);//정수형
		String str2 = String.valueOf(10.5);//실수형
		String str3 = String.valueOf(true);//boolean

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
