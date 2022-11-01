package day1101;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//인스턴스 생성
		PhoneInfo phone = new PhoneInfo();
		//배열 선언
		PhoneInfo[] phoneArray = null;
		int count=0;
		
		while(true) {
		
			System.out.println("메뉴: 1.등록인원수 2.전화번호 등록  3.전화번호 목록 4.종료");
			int menu = s.nextInt();//메뉴번호
			
			switch(menu) {
			
				case 1:
					System.out.print("등록인원수:");
					phoneArray = new PhoneInfo[s.nextInt()];
					break;
					
				case 2:
					System.out.print("이름:");
					String name = s.next();
					System.out.print("전화번호:");
					String phoneNo = s.next();
					System.out.print("생일:");
					String birth = s.next();
					
					phoneArray[count++] =new PhoneInfo(name,phoneNo,birth);
					System.out.println("전화번호 등록 성공");
					break;
					
				case 3://전화번호 목록
					for(PhoneInfo p : phoneArray) {
						System.out.printf("이름:%s 전화번호:%s 생일:%s\n",p.name,p.phone,p.birthday);
					}
					
				case 4:
					break;
					
				default:
					System.out.println("메뉴를 다시 선택하세요!");
					
			}
		
		}

	}

}




