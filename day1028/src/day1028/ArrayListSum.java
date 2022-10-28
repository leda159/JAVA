package day1028;

import java.util.ArrayList;
import java.util.Scanner;

	/*조건
	1.Scanner,반복문 사용

	국어성적:XXX
	영어성적:XXX
	수학성적:XXX

	Scanner로 입력받은 성적을 ArrayList에 추가하여
	다음과 같이 출력

	학생성적
	국어성적:XXX
	영어성적:XXX
	수학성적:XXX
	성적총합계:XXX
	성적평균:XX.X*/

public class ArrayListSum {

	public static void main(String[] args) {
	
		//<>제네릭(generic):객체 타입으로 선언해야 한다.
		//Integer : 정수형 기본 자료형을 객체 타입으로 선언한 wrapper 클래스
		//heap 메모리에 ArrayList를 만든다
		ArrayList<Integer> grades = 
				new ArrayList<Integer>(); 
		
		//변수 선언 없는 경우
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어성적:");
		grades.add(scanner.nextInt());
		System.out.print("영어성적:");
		grades.add( scanner.nextInt());
		System.out.print("수학성적:");
		grades.add(scanner.nextInt());
		
		//총점
		int total = 0;
		
		//배열인 경우 향상된 for문 사용가능
		for(int grade : grades ) {
			total += grade;
		}
		
		//평균
		double avg = (double)total / grades.size(); //배열의 크기
		
		System.out.println("학생성적");
		System.out.printf("국어성적:%d\n",grades.get(0));
		System.out.printf("영어성적:%d\n",grades.get(1));
		System.out.printf("수학어성적:%d\n",grades.get(2));
		System.out.printf("총점:%d\n",total);
		System.out.printf("평균:%.1f\n",avg);

	}

}


//process -> 운영체제 메모리를 할당 받아서 실행되는 '독립적인 프로그램'
//ex) 카카오톡

//thread -> 카카오톡에서 대화창 

//processor -> 하드웨어

//new 연산자를 만들면 heap 영역에 인스턴스가 생성된다.










