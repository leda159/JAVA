package day1028;

import java.util.Scanner;

public class StarPrintExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("별라인수:");
		int num = scanner.nextInt();
		scanner.close();
		
		for(int i=1; i<=num; i++) {//행수
			for(int j=1; j<=i; j++) {//열수
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
