package exam09;

public class InstanceofExample {
	
	//static 메서드 = > 메서드 영역으로 들어간다
	public static void method1(Parent parent) {
		
		//Child라는 객체는 parent 부모클래스로부터
		//상속을 받은 자식클래스인지 여부를 체크함
		if(parent instanceof Child) {
			//다운 캐스팅을 할려면
			//업 캐스팅을 먼저 해야한다
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	
	//메서드
	public static void method2(Parent parent) {
		//instanceof 미사용 하고 다운캐스팅
		//ClassCastException 예외 발생
		Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		
		//자동타입 변환이 일어난다
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

}
