package ex03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("----------------------------");
		myCar.FrontLeftTire = new KumhoTire();
		myCar.FrontRightTire = new KumhoTire();
		
		
		myCar.run();

	}

}
