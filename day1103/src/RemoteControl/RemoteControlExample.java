package RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//RemoteControl이라는 인터페이스를 가르키는 rc
		RemoteControl rc;
		
		//인터페이스를 가진 구현객체이다
		//구현객체가 인터페이스로 자동 타입변환이 일어난다.
		//자동타입변환
		//RemoteControl rc = new Television();
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		
		//자동타입변환
		//RemoteControl rc = new Audio();
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}

}
