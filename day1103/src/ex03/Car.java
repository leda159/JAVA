package ex03;

public class Car {
	
	//		인터페이스 필드 = 구현객체
	Tire FrontLeftTire = new HankookTire();
	Tire FrontRightTire = new HankookTire();
	Tire BackLeftTire = new HankookTire();
	Tire BacktLeftTire = new HankookTire();
	
	void run() {
		FrontLeftTire.roll();
		FrontRightTire.roll();
		BackLeftTire.roll();
		BacktLeftTire.roll();
		
	}
}
