package day1028;

import java.util.Scanner;

public class RandomNumTotal {

	public static void main(String[] args) {
	
		/*
		 * 조건 
		 * 1. 1부터 800까지 숫자중 난수 5개를 발생시키되 3의 배수인 경우에만 난수를 발생시킨다. 
		 * 2. 출력 발생된 난수: XXX XXX XXX XXX XXX
		 * 3. 합계:XXX
		 */
		
		int printCnt = 0; //출력 변수
		int totalSum = 0; //난수 합산 수
		
		System.out.print("발생된 난수중 3의 배수:");
		
		while(printCnt<5) { //0 1 2 3 4 출력이 5개가 되어야 함
			int rNum = (int)(Math.random()*800)+1; //1~800까지 랜덤
			
			if(rNum % 3 == 0) {//난수 중에서 3의 배수를
				System.out.print(rNum + " ");//콘솔창에 출력 함
				printCnt++;  //출력 횟수 1 증가
				totalSum += rNum;
			}
		}
		
		System.out.printf("\n발생된 난수 합계:%,d",totalSum);
	}
}
