package day1107.exam04;

//외부클래스
public class Outter {

	//자바 7버전까지
	public void method1(final int arg) {
		//지역변수
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		
		//메서드안에 있는 로컬클래스
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8버전 이상에서는 로컬 클래스가 선언된 경우
	//매개변수와 지역변수를 final선언된 것처럼 인식
	public void method2(int arg) {
		
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
		
	}
	
}
