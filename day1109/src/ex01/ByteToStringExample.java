package ex01;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		//배열 선언
		//Ascii코드
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		//new String > Heap 메모리에 String 인스턴스 생성됨
		//바이트배열을 읽으면 문자열로 변환처리 된다.
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//배열에 있는 인덱스가 6인 위치부터 4개를 읽어온다. > 74,97,118,97
		//74,97,118,97 > 문자로 변경되어서 출력된다.
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
	}


}
