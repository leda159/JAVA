package day1028;

import java.util.Scanner;

public class PointCalcExample {

	/*
	 * 메뉴: 1. 일반회원(3%) 2.우수회원(5%) 3.VIP회원(10%) 
	 * 메뉴선택: X 회원이름: XXX 결제금액: XXXXXX
	 * XXX 회원 결제액 XXX,XXX원에 대해 XXX,XXX원이 적립되었습니다
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴:1.일반회원(3%) 2.우수회원(5%) 3.VIP회원(10%) ");
		
		System.out.print("메뉴선택:");
		int menu = scanner.nextInt();//메뉴선택
		System.out.print("회원이름:");
		String name = scanner.next();//회원이름
		System.out.print("결제금액:");
		int cardAmt = scanner.nextInt();//결제금액
		
		scanner.close();
		
		int pointAmt = 0;
		
		switch(menu) {
			case 1:
				pointAmt = (int)(cardAmt *0.03);
				break; //반드시 브레이크를 넣어야 한다
		
			case 2:
				pointAmt = (int)(cardAmt *0.05);
				break;
			
			case 3:
				pointAmt = (int)(cardAmt *0.1);
				break;
				
			default://case 1 2 3이 아닐때
				System.out.println("메뉴를 다시 선택하세요");
		}
		System.out.printf("%s 회원 결제액 %,d원에 대해 %,d원이 적립 되었습니다\n",
				name,cardAmt,pointAmt);	
	}
}

