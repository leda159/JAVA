package day1028;

import java.util.Scanner;

public class LoginCheckExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		//int password = Integer.parseInt(strPassword);
		//if(password == 12345)
		//문자열일땐 .equals
		//정수일땐 ==
		
		
		if(name.equals("java")){
			if(strPassword.equals("12345")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실대 : 패스워드가 틀림");
			}
			
		}else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음");
		}
	}

}
