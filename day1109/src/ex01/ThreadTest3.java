package ex01;

import java.util.ArrayList;

public class ThreadTest3 implements Runnable {
	
	public int seq;
	
	public ThreadTest3(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq + "thread start");
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(this.seq + "thread end");
	}
	
	public static void main(String[] args) {

		ArrayList<Thread> threads = new ArrayList<Thread>(); 

		//10개의 Thread를 생성하고 ArrayList에 대입 
		for(int i=0; i<10; i++) {
			Thread t = new Thread(new ThreadTest3(i));
			t.start();
			threads.add(t);
		}
		for(int i=0; i<threads.size(); i++) {
			//Thread 정보를 가져온다.
			Thread t = threads.get(i);
			
			try {
				//main thread는 다른 thread가
				//종료 될때까지 기다렸다가 다 수행되고 종료
				t.join();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main thread end");
	}
}









