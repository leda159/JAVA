package day1027;

import java.util.Scanner;

//접근 제한자

//default: 접근 제한자를 선언하지 않을 경우
//public: 모든 클래스에서 접근 경우
//private: get/set 메서드를 통해서 접근허용 
//protected: 같은 패키지 내에 있는 클래스와 상속을 받은 다른 패키지에 있는
//			 자식클래스도 접근 허용

//클레스의 첫글자는 대문자로 해야 한다 : Naming Rule (명명규칙)
//Camel 표기법 : StudentInfo 두문자가 합쳐질때 두번째문자는 대문자 
public class StudentInfo {

	//매개변수가 배열 형태로 들어온다
	public static void main(String[]args) {
		
		//변수를 선언할때 총 9개로 선언할수 있다.
		
		//자바의 기본자료형 8개 + 객체타입인(String)
		
		//정수타입
		//byte, short(2바이트), int(4바이트),
		//long(8바이트)
		
		//실수
		//float(4바이트), double(8qkdlxm)
		
		//문자
		//char(2바이트)
		
		//참or거짓
		//boolean(1바이트)
		
		
		
	
	String name = "홍길동";
	int age = 23;
	String addr ="부산시 온천1동";
	
	System.out.println("학생이름:"+name);
	System.out.println("학생나이:"+age+"세");
	System.out.println("학생주소:"+addr);
	
	//%s : 문자열 변수에 값을 출력하는 경우
	//%d : 정수형 변수에 값을 출력하는 경우
	//%f : 실수형 변수에 값을 출력하는 경우
	System.out.printf("학생이름:%s\n",name);
	System.out.printf("학생이름:%d\n",age);
	System.out.printf("학생이름:%s",addr);
	System.out.println("");
	
	int num1 = 1000;
	int num2 = 2000;
	int result = num1 + num2;
	
	System.out.printf("%d + %d = %d", num1, num2, result);
	System.out.println("");
	System.out.printf("%,d + %,d = %,d", num1, num2, result);
	
	
	
	}
}









