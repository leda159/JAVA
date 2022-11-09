package ex01;

public class StringIndexOfExample {
	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		
		//문자열에서 특정 문자열의 위치를 검색하여 인덱스
		//값을 리턴하는 메서드
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);//3
		
		//문자열 검색을 하여 없으면 indexOf는 -1을 리턴한다
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}

		String str2 = "Java is fun! Java is easy";
		//문자열에서 특정 문자열을 오른쪽에서 왼쪽으로 검색 하여
		//인덱스 값을 리턴하는 메서드
		System.out.println(str2.lastIndexOf("Java"));//13
		
		//영어의 Java를 한글 자바로 변경해서 newStr2에 대입한다.
		String newStr2 = str2.replace("Java", "자바");
		System.out.println("변경 문자열:" + newStr2);
	}
}
