package ex05;

public class VehicleExample {

	public static void main(String[] args) {
		//자동 타입변환(= 업 캐스팅)
		//자동 타입변환이 되면 인터페이스에 있는 메서드만 접근 가능
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		
		//자동타입 변환을 강제타입변환으로 바꾼다 (= 다운 캐스팅)
		//vehicle이 가르키고 있는 주소값이 Bus
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}
		
	}

}
