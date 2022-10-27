package day1027;

import java.util.Scanner;

public class AtmExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int depositAmt = 0;//입금액
		int withdrawAmt = 0;//출금액
		int remainAmt = 0;//잔액
		
		while(true) {
			System.out.println("[메뉴]1.입금 2.출금 3.잔액 4.종료");
			int menu = scanner.nextInt();//메뉴 번호
		
			
			if(menu == 1) {//입금 처리
				System.out.println("입금 금액:");
				depositAmt = scanner.nextInt();
				remainAmt += depositAmt;
				System.out.println(depositAmt+"원 입금 했습니다");
			}else if(menu == 2) {//출금 처리
				System.out.println("출금 금액:");
				withdrawAmt = scanner.nextInt();
				
				if(withdrawAmt > remainAmt) {
					System.out.println("돈이 부족합니다.");
					continue; //반복문 중에서 다시 위로 올라감
				}
				
				remainAmt -= withdrawAmt;
				System.out.println(withdrawAmt+"원 출금 했습니다");
			}else if(menu == 3) {
				System.out.printf("현재 잔액은:%,d\n",remainAmt);
			}else if(menu == 4) {
				break;
			}else {
				System.out.println("메뉴를 다시 선택하세요");
			}
			
		}
		scanner.close();

	}

}
