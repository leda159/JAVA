package ex04;

public class Driver {
	//자동 타입  변환
	//  인터페이스      = 구현객체
	//Vehicle vehicle = new Bus();
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

