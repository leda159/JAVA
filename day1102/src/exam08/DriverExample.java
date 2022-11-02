package exam08;

public class DriverExample {
	public static void main(String[] args) {

		//접근을 하기위해서 인스턴스를 생성
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}

