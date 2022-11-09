package ex01;

public class Calculator {

	private int memory;
	
	public int getmemory() {
		return memory;
	}
	
	//synchronized : 동기화 함수
	//thread를 사용중인 객체를 다른 thread가 접근하여 값을
	//변경하지 못하도록 하는 역할을 수행한다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);//대기시간 2초
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ ":" + this.memory);
	}
}
