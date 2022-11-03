package day1103;

public abstract class Calculator {

	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public abstract int add(int num1, int num2);
	public abstract int minus(int num1, int num2);
	public abstract int mul(int num1, int num2);
	public abstract double div(int num1, int num2);
}
