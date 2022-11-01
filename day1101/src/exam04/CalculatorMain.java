package exam04;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째수:");
		int num1 = scanner.nextInt();
		System.out.println("두번째수:");
		int num2 = scanner.nextInt();
		
		Calculator c = new Calculator();
		
		System.out.printf("%,d + %,d=%,d\n",num1,num2,c.add(num1, num2));
		System.out.printf("%,d - %,d=%,d\n",num1,num2,c.minus(num1, num2));
		System.out.printf("%,d * %,d=%,d\n",num1,num2,c.mul(num1, num2));
		System.out.printf("%,d / %,d=%.1f\n",num1,num2,c.div(num1, num2));

	}

}
