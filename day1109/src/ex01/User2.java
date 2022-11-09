package ex01;

public class User2 extends Thread {
	private Calculator calulator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calulator = calculator;
	}
	
	public void run() {
		calulator.setMemory(50);
	}
}
