package day1101;

public class B {

	public B() {
		//A클래스가 public이므로 인스턴스 생성 가능
		A a = new A();
		a.field1 = 1;
		a.field2= 1;
		//a.field3 = 1;
		
		//private으로 필드 선언
		a.setField3(1);
		
		
		
		a.method1();
		a.method2();
		//private으로 필드 선언
		//a.method3();
		
	}
}
