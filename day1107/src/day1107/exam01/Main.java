package day1107.exam01;

public class Main {
	public static void main(String[] args) {
		
		//인스턴스 멤버 클래스는 먼저 외부클래스의
		//인스턴스가 먼저 생성
		A a = new A();
		
		//내부 클래스의 인스턴스 생성 가능
		A.B b = a.new B();
		
		b.field1= 3;//인스턴스 필드에 접근가능
		b.method1();//인스턴스 메서드에 접근가능
		
		//클래스 C는 static으로 선언된 정적 멤버 클래스
		//이므로 외부클래스인 A.java 인스턴스 생성여부와
		//관계없이 인스턴스 생성 가능
		A.C c = new A.C();
		
		c.field1 = 3;//인스턴스 필드 접근 가능
		c.method1();//인스턴스 메서드 접근 가능
		A.C.field2 = 3;//정적 필드 접근 가능
		A.C.method2();//정적 메서드 접근 가능
		
		a.method();//외부 메서드 접근가능
		
	}
}
