package exam07;

public class CalculatorExample {

	public static void main(String[] args) {
		//static 필드와 staric메서드 접근
		//클래스명.필드 
		//클래스명.메서드명
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result3:" + result3);

	}

}
