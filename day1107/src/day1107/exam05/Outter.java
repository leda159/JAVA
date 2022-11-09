package day1107.exam05;

//외부클래스
public class Outter {

	//인스턴스 필드 선언
	String field = "Outter-field";
	
	//인스턴스 멤버 메서드
	void method() {
		System.out.println("Outter-method");
	}
	
	//인스턴스 멤버 클래스
	class Nested {
		
		//인스턴스 멤버 필드
		String field = "Nested-field";
		
		//인스턴스 멤버 메서드
		void method() {
			System.out.println("Nested-method");
		}
		
		//인스턴스 멤버 메서드
		void print() {
			System.out.println(this.field);
			this.method();
		}
	}
}
