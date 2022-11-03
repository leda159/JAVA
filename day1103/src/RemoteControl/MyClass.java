package RemoteControl;

public class MyClass {

	//1.인터페이스형 필드 선언하면 구현객체를 대입 할수 있다.
	RemoteControl rc = new Television();
	
	MyClass(){}
	
	//2.매개변수 1개 생성자 호출시 인터페이스형 매개변수로 전달
	MyClass(RemoteControl rc){
		this.rc = rc;
		
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//3.매서드내 지역변수로 인터페이스 활용
	void methodA() {
		//지역변수(=로컬변수)
		RemoteControl rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//4.메서드에 매개변수로 인터페이스를 선언
	void methodB(RemoteControl rc) {
		
		rc.turnOn();
		rc.setVolume(5);
	}
}
