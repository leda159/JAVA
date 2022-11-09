package day1107.exam03;

//외부클래스
public class A {
	
	int field1;//인스턴스 멤버 필드
	void method1() {} //인스턴스 멤버 메서드
	
	static int field2; //정적 멤버 필드
	static void method2() {} //정적 멤버 메서드
	
	//인스턴스 멤버 클래스
	class B {
		//인스턴스 멤버 클래스에서는
		//외부클래스의 모든 필드와 메서드에 접근가능 
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
			
		}
	}
	
	//정적 멤버 클래스에서는 외부클래스의 정적멤버 필드와
	//정적 멤버 메서드에만 접근 가능
	static class C {
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
