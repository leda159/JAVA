package day1108;

public class ThrowsExample {
	public static void main(String[] args) {

		try {
			findClass();//메서드 호출
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		//ClassNotFoundException 예외발생시
		//throws(지연처리) : findClass 메서드를 호출한 
		//곳에서 예외처리를 하도록 위임처리한다.
		Class clazz = Class.forName("java.lang.String2");
	}

}




