package RemoteControl;

//사용이유?
//개발자 측면에서 코드 변경 없이 실행내용과
//리턴값을 다양하게 구현가능

//인터페이스 특징
//1.인터페이스는 상수와 추상메서드만 구성
//2.인터페이스는 다중 상속 허용
// public interface Test extends AInterface,BInterface;  < 두개이상 가능
//3.인터페이스 상수선언시 static final 예약어 생략 가능
//4.인터페이스 추상메서드 선언시 abstract 예약어 생략 가능
public interface RemoteControl {

	//상수
	public static final int MAX_VOLUME = 10;
	public static final int Min_VOLUME = 0;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
