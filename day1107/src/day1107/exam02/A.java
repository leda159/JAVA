package day1107.exam02;

//접근제한자 한개의 클래스만 가능
//인스턴스 멤버 클래스는 외부클래스의 인스턴스 필드와
//인스턴스 메서드에서 인스턴스 생성 가능하나
//정적 필드 초기값이나 정적 메서드에서 인스턴스를 생성할 수 없다.
public class A {

	//클래스 B는 인스턴스 멤버 클래스이므로 필드에
	//인스턴스를 생성 가능
	B field1 = new B();
	
	//정적 멤버 클래스 이므로 모든 필드의 초기값으로 인스턴스
	//생성 가능
	C field2 = new C();
	
	
	void method1() {
		//인스턴스 메서드이므로 인스턴스 생성가능
		B var1 = new B();
		//정적 멤버 메서드 이므로 인스턴스 생성가능
		C var2 = new C();
	}
	
	//static B field3 = new B();
	//C는 정적 멤버 클래스이므로 인스턴스 생성 가능
	static C field4 = new C();
	
	//정적 멤버 메서드에서는 외부클래스의
	//정적 필드와 정적 메서드만 접근 가능하고
	//인스턴스 필드와 인스턴스 메서드에는 접근 불가
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B {}
	
	//정적 멤버 클래스
	static class C {}
}





