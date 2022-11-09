package day1108;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		
		try {
			
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수의 수가 부족합니다.");
			return;
		}catch(NumberFormatException e) {
			//숫자가 아닌 문자가 입력시 예외 발생
			System.out.println("숫자로 변환할 수 없습니다.");
		}catch(Exception e) {//예외 최고 부모인 
			//Exception 은 맨밑에 선언
			System.out.println("예외가 발생");
		 //배열의 인덱스 오류시 처리	
		}finally {
			System.out.println("다시 실행하세요");
		}

	}

}