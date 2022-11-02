package day1102;

//부모클래스 CellPhone
public class CellPhone {

	//필드
	String modle;
	String color;
	
	
	//메서드는 전부 default로 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다");
	}
	//메시지 보내기
	void sendVoice(String message) {
		System.out.println("자기" + message);
	}
	//음성 듣기
	void receiveVoice(String message) {
		System.out.println("상대방" + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
