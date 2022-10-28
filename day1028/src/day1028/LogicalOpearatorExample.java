package day1028;

public class LogicalOpearatorExample {

	public static void main(String[] args) {
		
		int charCode ='A';
		
		if((charCode >= 65) && (charCode<=90)) {
			System.out.println("대문자 입니다.");
		}
		
		if((charCode >= 97) && (charCode<=122)) {
			System.out.println("소문자 입니다.");
		}
		
		if((charCode >48 ) && (charCode<57)) {
			System.out.println("0~9 숫자 입니다.");
		}
		
		int value = 6;
		
		if((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2 또는 3 의 배수입니다.");
		}
	}
}
