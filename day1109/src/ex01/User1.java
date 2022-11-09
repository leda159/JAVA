package ex01;

public class User1 extends Thread {
	private Calculator calulator;
	
	//메서드
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calulator = calculator;
	}
	
	public void run() {
		calulator.setMemory(100);
	}
}
