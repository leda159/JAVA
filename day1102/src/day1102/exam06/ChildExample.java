package day1102.exam06;

public class ChildExample {
	public static void main(String[] args) {

		//부모클래스 참조변수 = new 자식클래스
		//자동타입변환(UpCasting)
		//자식클래스에서 별도로 선언한 메서드에 접근 불가
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();
		
		//강제타입변환(다운캐스팅)
		//다운캐스팅 하는 경우는
		//해당 자식클래스가 부모클래스를 상속받은
		//클래스인지 instanceof 연산자를 사용하여
		//반드시 먼저 체크해야 한다.
		if(parent instanceof Child) {
			//다운캐스팅
			Child c = (Child)parent;

		c.method1();
		c.method2();
		c.method3();
		
		}
	}
}




