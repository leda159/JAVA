package day1107.exam08;

public class CheckBox {

	//필드 선언
	OnselectListener listener;
	
	//메서드 선언
	//OnselectListener listener = new BackgroundChangeListener();
	//자동타입변환
	void setOnSelectListerer(OnselectListener listener) {
		this.listener = listener;
	}
	
	//메서드 선언
	void select() {
		listener.onSelect();
	}
	
	//인터페이스 선언
	static interface OnselectListener {
		void onSelect();
	}
}




