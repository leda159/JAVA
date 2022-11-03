package day1103;

public class CalMain extends Calculator {

	public CalMain(int num1, int num2) {
		super(num1, num2);
	
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double div(int num1, int num2) {
		// TODO Auto-generated method stub
		return (double)num1 / num2;
	}
	
	

}
