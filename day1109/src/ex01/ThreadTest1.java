package ex01;

//Thread를 동작 시키기 위해선 상속을 받는다.
public class ThreadTest1 extends Thread {
	
	public int seq;
	
	public ThreadTest1(int seq) {
		this.seq = seq;
	}
	
	
	@Override
	public void run() {
		
		System.out.println(seq +"thread start");
		
		try {
			Thread.sleep(1000);//1초동안 대기
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(seq +"thread end");
	}


	public static void main(String[] args) {
		
		//Thread 10개 생성
		for(int i=0; i<10; i++) {
			
			//Thread를 상속 받은 경우
			Thread t = new ThreadTest1(i);
			//Thread를 동작시키는 명령문
			//Thread에 있는 run()이라는 메서드가 실행됨
			t.start();
		}
		System.out.println("main end.....");
	} 
}















