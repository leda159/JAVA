package day1027;

import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {
		
		//변수 scanner는 클래스를 가르키고 있는 참조변수
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		
		//nextIng() : 정수형 자료를 입력 받음
		//nextFloat() : 4바이트 실수형 자료
		//ex)대한민국 만세
		//next() : 문자열 자료 입력 (공백이 있기 전까지 문자열을 가져옴)
		//nextLine() : 문자열 자료(공백까지 포함해서 전체 문자열을 가져옴)
		int num = scanner.nextInt();
		
		//scanner를 닫아주지 않으면 메모리가 계속 돌아다닌다
		scanner.close();
		
		if(num % 2 == 0) {
			System.out.println(num+"은 짝수입니다");
		}
		else {
			
			System.out.println(num+"은 홀수입니다");
		}
	
	}

}
