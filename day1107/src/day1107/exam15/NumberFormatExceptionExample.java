package day1107.exam15;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
	
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		//NumberFormatException 예외발생
		//문자를 숫자로 변경시 예외 발생
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
		
	}
}
