package day1027;

import java.util.Scanner;


public class OddEvenTotal {

	public static void main(String[] args) {
	
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = scanner.nextInt() ;
		
		scanner.close();
		
		int evenSum=0;//홀수
		int oddSum=0;//짝수
		int totalSum=0;//총합
				
		
		for(int i=1; i<=num; i++) {
		
			if(i % 2 == 0 ) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
			totalSum+=i;
		}
		System.out.printf("홀수합:%,d\n", evenSum);
		System.out.printf("짝수합:%,d\n", oddSum);
		System.out.printf("총합:%,d\n", totalSum);
	}
}
