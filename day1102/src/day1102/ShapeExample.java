package day1102;

import java.util.Scanner;

public class ShapeExample {

	public static void main(String[] args) {
		
		int width,height;
		
		Scanner s = new Scanner(System.in);
		System.out.println("메뉴: 1.직사각형 2.삼각형 3.종료 ");
		int menu = s.nextInt();
		
		if(menu == 1) {
			System.out.print("가로:");
			 width = s.nextInt();
			System.out.print("세로:");
			 height = s.nextInt();
			 Rectangle rectangel = new Rectangle(width , height);
			 System.out.printf("가로:%,d 세로:%,d인 직사각형 면적:%,d\n",
					 width,height,(int)rectangel.getArea());
			 
		}else if(menu == 2) {
			System.out.print("가로:");
			 width = s.nextInt();
			System.out.print("세로:");
			 height = s.nextInt();
			 Triangle triangle = new Triangle(width,height);
			 System.out.printf("가로:%,d 세로:%,d인 직사각형 면적:%,d\n",
					 width,height,(int)triangle.getArea());
		}else if(menu == 3) {
			System.out.println("프로그램 종료");
			System.exit(0);//프로그램 종료 방법
		}else{
			System.out.println("메뉴를 다시 선택하세요.");
		}


	}

}
