package day1027;

import java.util.Scanner;

public class LottoExample {

	
	public static void main(String[] args) {
		
			//	1~500 사이의 난수
			//int num = (int)(Math.random()*500)+1;
		
		Scanner scanner = new Scanner(System.in);
		
		
		//난수 발생(1~700 사이의 숫자)
		int rNum = (int)(Math.random()*700)+1;
		//몇번만에 맞췄는지 변수 설정 (입력횟수)
		int count = 0;
		
		//맞출때까지 
		while(true) {
			System.out.println("값을 입력하세요.");
			//iNum : 입력 값
			int iNum = scanner.nextInt();
			
			count++;//입력 횟수를 증가
			
			if(rNum > iNum) {
				System.out.println("더 큰 숫자를 입력하세요.");
			}else if(rNum < iNum) {
				System.out.println("더 작은 숫자를 입력하세요.");
			}else{
				System.out.println(count+"번 만에 당첨되셨습니다!");
				break; // 반복문 탈출
			}
			
		}
		scanner.close();
	}
}
