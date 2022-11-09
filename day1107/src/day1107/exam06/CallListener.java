package day1107.exam06;

import day1107.exam06.Button.OnClickListener;

//구현객체
public class CallListener implements OnClickListener {

	//인터페이스의 추상메서드를 오버라이딩 처리
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
