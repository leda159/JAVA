package day1028;

import java.util.Scanner;

	/*조건
	1.Scanner 사용

	첫번째수:XXX
	두번째수:XXX

	출력
	3의배수의 합:XXX,XXX
	5의배수의 합:XXX,XXX
	 */

public class ForSumExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째수:");
		int num1 = scanner.nextInt();
		System.out.print("두번째수:");
		int num2 = scanner.nextInt();
		
		scanner.close();
		
		int totalSum3 = 0;
		int totalSum5 = 0;
		
		for(int i=num1; i<=num2; i++) {
			if(i % 3 == 0) {
				totalSum3 += i;
			}
			if(i % 5 == 0) {
				totalSum5 += i;
			}
		}
		System.out.printf("3의배수의 합:%,d\n",totalSum3);
		System.out.printf("5의배수의 합:%,d",totalSum5);
	}

}
