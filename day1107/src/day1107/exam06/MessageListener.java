package day1107.exam06;

import day1107.exam06.Button.OnClickListener;

//구현객체
public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
