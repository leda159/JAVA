package day1101.exam08;

import day1101.A;

public class C {

	//생성자
	public C() {
		//A클래스가 public 선언
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1; //다른 패키지 이므로 접근 불가
		//a.field3 = 1; //private으로 선언
		
		a.setField3(1);
		
		a.method1();
		//a.method2(); //default이므로 접근불가
		//a.method3(); //private으로 선언
	}
}
