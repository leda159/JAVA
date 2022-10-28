package day1028;

import java.util.Scanner;

/*윤년
	조건1
	년도를 4로 나누어 떨어지고 100으로 나누면 0이 아님
	조건2
	년도를 400으로 나누면 0으로 떨어짐
	
	조건1 || 조건2
	
	파일명:MonthDayCalc.java
	조건
	1.switch문을 이용
	2.Scanner
	
	년도입력:XXXX
	월입력:XX
	
	XXXX년도 XX월의 일수는 XX일 입니다.*/



public class MonthDayCalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도 입력:");
		int year = scanner.nextInt();
		System.out.println("월 입력:");
		int month = scanner.nextInt();
		
		scanner.close();
		
		
		int day = 0;//해당월의 일수
		
		switch(month) {
		
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0) ||
			   (year % 400 == 0)) {//윤년
				day = 29;
			}else {
				day = 28;
			}
			
			break;
			
		default:
			System.out.println("월을 다시 입력하세요!");
	}
	
	System.out.printf("%d년도 %d월의 일수는 %d일 입니다.\n",year,month,day);
	}
}
