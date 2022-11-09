package ex01;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234566";
		
		//특정 문자열 추출
		//substring(시작인덱스번호,종료인덱스번호)
		//특정 문자열 추출시 시작인덱스번호 부터 
		//종료 인덱스번호 -1 문자열 추출
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		//시작이 있고 종료가 없으면
		//시작 인덱스번호 부터 문자열 끝까지  
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
