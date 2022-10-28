package day1028;

import java.util.Scanner;

public class PayCalcExample {
	
	/*
	 * - Scanner 사용 - if문 사용
	 * 
	 * 사원이름: XXX 근무시간: XX
	 * 
	 * XXX사원의 총급여는 xxx,xxx원 입니다.
	 * 
	 * 조건 - 시급:5000원 - 근무시간이 8시간 초과하면 시급의 150%를 추가로 지급
	 */
	
	
	
	

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
	
		int hourPay = 5000;//급여
		int realPay;	   //실제 급여
		
		System.out.print("사원이름:");
		String name = scanner.next();//사원이름
		
		System.out.print("근무시간:");
		int workHour = scanner.nextInt();//근무시간
		
		if(workHour > 8) { //초과 근무를 한 경우
			realPay = (int)((hourPay*8) + (workHour - 8)*(hourPay*1.5));
		}else {
			realPay = workHour * hourPay;
		}
		
		System.out.printf("%s 사원의 총 급여는 %,d원 입니다.",name,realPay);
		
		scanner.close();
	
	}

}
