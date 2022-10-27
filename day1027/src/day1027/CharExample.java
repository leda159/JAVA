package day1027;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A'; //리터럴(literal) 방식 선언
		char c2 = 65; // ASCII 코드표
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		char c7 = '\uB178';//노
		char c8 = '\uC138';//세
		char c9 = '\uC6C5';//웅
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println("이름:" +c7+c8+c9);
		System.out.println("\uB178\uC138\uC6C5");
		
		
		
		
	}
}











