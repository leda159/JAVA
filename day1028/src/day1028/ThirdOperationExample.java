package day1028;

import java.util.Scanner;

public class ThirdOperationExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while(true) {
		System.out.println("1.초중고(3,000)원 2.성인(5,000)원 3.중장년(7,000)원 4.종료");
		
		System.out.print("메뉴선택:");
		
		int menu = scanner.nextInt();//메뉴
		
		if(menu == 4 ) {
			break;
		}
		
		System.out.print("인원수:");
		
		int count = scanner.nextInt();//인원수

		int fee = (menu ==1)? count * 3000 : 
				  (menu ==2)? count * 5000 : count * 7000;
		
		String menuName = 
				(menu ==1)? "초중고": 
				(menu ==2)? "성인" : "중장년";
		
		
		System.out.printf("선택하신 %s 인원수 %d명에 입장료는 %,d원 입니다.\n",
						  menuName,count,fee);
				
				  	  
		
		}
	}
}
