package day1107.exam06;

public class ButtonExample {
	public static void main(String[] args) {

		//인스턴스 생성
		Button btn = new Button();
		//다형성(메서드 오버라이딩 + 타입변환)
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();

	}

}
