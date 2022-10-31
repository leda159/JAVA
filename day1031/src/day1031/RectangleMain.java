package day1031;

import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("가로길이:");
		int width = s.nextInt();
		
		System.out.print("세로길이:");
		int height = s.nextInt();
		
		s.close();
		
		Rectangle r = new Rectangle(width,height);
		
		System.out.printf(
				"가로길이가 %,d이고 세로길이가 %,d인 직사각형 면적은 %,d이다.",
				width,height,r.getArea());

	}

}



