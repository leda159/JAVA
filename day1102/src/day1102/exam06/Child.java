package day1102.exam06;

//다형성 = > 오버라이딩 + 타입변환
public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}

	//자식클래스에서 사용하는 메서드
	public void method3() {
		System.out.println("Child-method3()");
	}

	
}
