package day1031;

import java.util.Scanner;

public class FloorMain {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("메뉴:1층은행 2층:약국 3층:헬스클럽 4층:병원");
		int floor = scanner.nextInt();
		
		scanner.close();
		
		
		switch(floor) {
		
		case 1:
				System.out.println("1층은 은행입니다");
			break;
		case 2:
				System.out.println("2층은 약국입니다");
			break;
		case 3:	
				System.out.println("3층은 헬스클럽 입니다");	
			break;
		case 4:
				System.out.println("4층은 병원입니다");
			break;
			
			default:
				System.out.println("메뉴를 다시 선택하세요!");
		}
		
		
		
		
	}

}
