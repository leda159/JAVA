package day1107.exam06;

public class Button {

	//인터페이스 형태의 필드 선언
	OnClickListener listener;
	
	//인스턴스 멤버 메서드
	//인터페이스 참조변수 = new 구현객체;
	//OnClickListener listener = new CallListener();
	//자동타입변환(=업캐스팅)
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//인스턴스 멤버 메서드
	void touch() {
		listener.onClick();
	}
	
	//인터페이스 (상수,추상메서드만 선언 가능)
	static interface OnClickListener {
		//추상메서드
		void onClick();
	}
}




