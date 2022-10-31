package day1031;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로 입력:");
		int width = scanner.nextInt();//width값 저장
		System.out.print("세로 입력:");
		int height = scanner.nextInt();//height값 저장
		
		scanner.close();
		
		//저장한 width,height값을 Rectangel클래스에 있는 필드에
		//대입한다.
		Rectangle rectangle = new Rectangle(width,height);
		
		//width, height의 값은 입력했을때 저장된 값을 가져와서 사용
		//참조변수 rectangle을 이용해서 Rectangel클래스의 getArea()메서드 호출
		//getArea()메서드는 width * height을 리턴한다.
		//
		System.out.printf("가로길이가%,d이고 세로길이가 %,d인 직사각형 면적은%,d이다",
				width,height,rectangle.getArea());
		
		
		
		
		
		
		

	}

}
