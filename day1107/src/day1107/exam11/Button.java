package day1107.exam11;

public class Button {

	//인터페이스 형식을 갖는 필드 선언
	OnClickListener listener;
	
	//메서드
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//메서드
	void touch() {
		listener.onClick();
	}
	
	//인터페이스
	static interface OnClickListener {
		void onClick();
	}
}



