package ex01;


//인터페이스 구현
class ThreadWithRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			
			//현재 실행중인 Thread 이름을 출력
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);//1초동안 대기
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadTest2 {
	public static void main(String[] args) {
		
		//인터페이스 Runnable을 사용할때는 Thread의 매개변수로
		//구현객체를 전달 해야한다.
		Thread t1 = new Thread(new ThreadWithRunnable());
		Thread t2 = new Thread(new ThreadWithRunnable());
		
		t1.start();//thread run() 가 동작
		t2.start();//thread run() 가 동작
	}
}
