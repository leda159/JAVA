package day1101;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		System.out.println("밑변:");
		int width = s.nextInt();
		System.out.println("높이:");
		int height = s.nextInt();
	
		Triangle t = new Triangle(width,height);
		//t.getArea(width, height);
		
		System.out.printf("밑변이 %,d이고 높이가 %,d인 삼각형 넓이는 %.1f이다",t.getWidth(),t.getHeight(),t.getArea(width, height));

	}

}
