package ex01;

class CustomThread extends Thread{

	@Override
	public void run() {
		
		int totalSum = 0;
		
		for (int i=0; i<=100; i++) {
			
			totalSum +=i;
			System.out.println("현재 쓰레드" + Thread.currentThread().getName() + "합계:" + totalSum);
		}
	}
}

	public class ThreadTest4 {	
		public static void main(String[] args) {
		
			Thread t1 = new CustomThread();
			t1.setName("1");
			t1.start();
			Thread t2 = new CustomThread();
			t2.setName("2");
			t2.start();

		}
	}









