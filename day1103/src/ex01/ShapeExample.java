package ex01;

import java.util.Scanner;

public class ShapeExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("메뉴선택");
		int menu = s.nextInt();
		
		switch(menu) {
		
		case 1:
			System.out.println("가로");
			int num1 = s.nextInt();
			System.out.println("세로");
			int num2 = s.nextInt();
			Rectangle r = new Rectangle(num1, num2);
			r.getArea();
			System.out.printf("가로 %,d 세로 %,d 인 사각형 면적은 %,d 이다.",num1,num2,(int)r.getArea());
			break;
			
		case 2:
			System.out.println("반지름");
			int num3 = s.nextInt();
			Circle c = new Circle(num3);
			c.getArea();
			System.out.printf("반지름이 %,d 인 원 면적은  %.1f이다.",num3,c.getArea());
			break;
			
			
			default:
				System.out.println("번호를 다시 선택하세요.");
				break;
		}
		
		s.close();

	}

}
