package day1108;

import java.util.Scanner;

public class TryCatchMain {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열 숫자 1:");
		String strNum1 = s.next();
		
		System.out.print("문자열 숫자 2:");
		String strNum2 = s.next();
		
		s.close();
		
		try {
			
			//문자열 -> 정수 변환
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			System.out.printf("%,d / %,d = %,d\n",
					num1,num2,num1/num2);
			
		}catch(ArithmeticException e) {
			System.out.println("분모는 0으로 나눌 수 없습니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 오류");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}

	}

}




