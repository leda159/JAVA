package day1031;

import java.util.Scanner;

public class FloorMain {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("층수:1층:은행 2층:약국 3층:헬스클럽 4층:병원 5.종료");
		
		System.out.print("층수 입력:");
		int floor = s.nextInt() ;
		
		s.close();
		
		switch(floor) {
			case 1:
				System.out.println("1층은 은행입니다.");
				break;
			case 2:
				System.out.println("2층은 약국입니다.");
				break;
			case 3:
				System.out.println("3층은 헬스클럽입니다.");
				break;
			case 4:
				System.out.println("4층은 병원입니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("층수를 다시 선택하세요!");
		}

	}

}




