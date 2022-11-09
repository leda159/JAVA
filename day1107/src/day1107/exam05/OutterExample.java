package day1107.exam05;

public class OutterExample {
	public static void main(String[] args) {

		//(1)인스턴스 멤버 클래스에 접근하려면
		//먼저 외부클래스의 인스턴스를 생성
		Outter outter = new Outter();
		
		//(2)내부클래스의 인스턴스를 생성
		Outter.Nested nested = outter.new Nested();
		nested.print();

	}

}
