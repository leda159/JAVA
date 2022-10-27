package day1027;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[]args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			//next() : 문자열을 입력시 공백전까지 입력
			//nextLine() : Enter키를 클릭할때까지 문자열을 입력 받는다.
			inputData = scanner.nextLine();
			//escape 문자를 이용하여 입력받은 문자열에 "" 출력
			System.out.println("입력된 문자열:\""+inputData+"\"");
			
			//문자열을 비교시에 == 는 주소를 비교한다.
			//문자열을 비교시에 실제로 값을 비교 할때는 .equals를 사용한다.
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
		scanner.close();
	}
}
