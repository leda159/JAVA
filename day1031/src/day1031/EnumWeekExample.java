package day1031;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		//열거형 클래스 선언 & 초기화
		//Student s = new Student(); 방식으로 클래스에 접근을 해야하는데
		//Calendar cal = Calendar.getInstance(); 에서 
		//getInstance();는 static으로 선언되어 있어서 클래스에 접근 가능하다.
		
		//getInstance(); static으로 선언된 메서드로
		//Calendar 클래스가 로딩될때 메서드 영역으로 
		//생성되고 static으로 선언된 메서드 이므로
		//클래스명.메서드로 접근이 가능하다.
		
		//싱글톤패턴
		//최초에 한번 인스턴스를 생성한후 다음부터는 생선된 인스턴스를
		//공유해서 재사용한다. > 메모리의 효율을 극대화 하는 기법.
		Week today = null;
		Calendar cal = Calendar.getInstance();
		//요일에 대한 숫자를 리턴
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;	
		}
		System.out.println("오늘 요일:" + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 자바 공부를 합니다");
		}
	}
}













