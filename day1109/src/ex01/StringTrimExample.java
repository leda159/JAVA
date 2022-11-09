package ex01;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "12 3  ";
		String tel3 = "  1234  ";
		
		//trim() > 문자열의 공백을 제거한다.
		//양쪽에 있는 공백만 없앤다
		//tel2의 12 3의 공백은 없애지 않는다.
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
