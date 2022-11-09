package ex01;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		//소문자로 바꿈
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		//문자열 비교시 대소문자 구분 안함/
		System.out.println(str1.equalsIgnoreCase(str2));
		

	}

}
