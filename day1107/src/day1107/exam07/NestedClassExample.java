package day1107.exam07;

public class NestedClassExample {
	public static void main(String[] args) {

		//외부클래스 인스턴스를 생성
		Car myCar = new Car();
		
		//인스턴스 멤버 클래스의 인스턴스를 생성
		Car.Tire tire = myCar.new Tire();
		
		//정적 멤버 클래스는 바로 인스턴스를 생성 가능
		Car.Engine engine = new Car.Engine(); 		

	}

}
