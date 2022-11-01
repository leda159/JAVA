package exam07;

public class Calculator {

	int mun;// 필드 (=맴버변수 = 인스턴스 변수)
	
	//static으로 필드 혹은 메서드를 선언하면
	//메서드 영역(=데이터영역=클래스영역)에 생성되고 
	//static으로 선언하면
	//객체의 생성과는 관계없이 클래스가 로딩되는 시점에
	//생성되는 것이다.즉 메모리에 한번 할당되었다가
	//프로그램이 종료시 해제되는 것으로 메모리 효율을 높인다.
	static double pi = 3.13159;
	
	static int plus(int x, int y) {
		
		//static 메서드 안에 인스턴스 변수를 사용불가
		//static 메서드 안에서는 this 예약어 사용 불가
		//num = 2;
		//this.num = 2;
		
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
}
