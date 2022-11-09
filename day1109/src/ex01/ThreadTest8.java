package ex01;

import javax.swing.JOptionPane;

class GameTimer extends Thread{
	@Override
	public void run() {
		
		for(int i=5; i>=1; i--){
			
			if(ThreadTest8.inputCheck==true){
				return;
			}
			
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("시간이 초과되어 당신이 졌습니다.");
		System.exit(0);
		
	}
}


public class ThreadTest8 {
	
	public static boolean inputCheck = false;
	
	public static void main(String[] args) {
		GameTimer gt = new GameTimer();
		
		// 난수를 이용하여 컴퓨터의 가위 바위 보를 정한다.
		String[] data = {"가위", "바위", "보"};
		int index = (int)(Math.random()*3); // 0~2사이의 난수 만들기
		String com = data[index];
		
		// 사용자로 부터 가위, 바위, 보 입력 받기
		String man = null;   // 사용자의 가위바위보가 저장될 변수
		
		// 카운트 다운 쓰레드 실행
		gt.start();
		
		do{
			man = JOptionPane.showInputDialog("가위, 바위, 보를 입력하세요");
		}while(!man.equals("가위") && !man.equals("바위") && !man.equals("보"));
		
		inputCheck = true;  // 입력이 완료됨을 알려주는 변수값을 변경한다.
		
		// 결과 판정하기
		String result = "";
		
		if( man.equals(com) ){
			result = "비겼습니다.";
		}else if( (man.equals("가위") && com.equals("보"))
				 || (man.equals("바위") && com.equals("가위"))
				 || (man.equals("보") && com.equals("바위")) ){
			result = "당신이 이겼습니다.";
		}else{
			result = "당신이 졌습니다.";
		}
		
		// 결과 출력
		System.out.println("=== 결 과 ===");
		System.out.println("컴퓨터 : " + com);
		System.out.println("당  신 : " + man);
		System.out.println("결  과 : " + result);
	}
}

