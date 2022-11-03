package day1103;

import java.util.Scanner;

public class CalExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("첫번째수:");
		int num1 = s.nextInt();
		System.out.println("두번째수:");
		int num2 = s.nextInt();
		
		s.close();
		
		CalMain c = new CalMain(num1,num2);
		
		
		c.add(num1, num2);
		c.minus(num1, num2);
		c.mul(num1, num2);
		c.div(num1, num2);
		
		System.out.println(num1 +"+"+ num2 +"="+ c.add(num1, num2));
		System.out.println(num1 +"-"+ num2 +"="+ c.minus(num1, num2));
		System.out.println(num1 +"*"+ num2 +"="+ c.mul(num1, num2));
		System.out.printf("%,d / %,d = %.3f",num1,num2,c.div(num1, num2));

	}

}
