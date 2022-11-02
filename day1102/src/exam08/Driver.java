package exam08;

public class Driver {
	//자동 타입 변환(업캐스팅)
	//      받는놈        보내는놈
	
	//Vehicle vehicle = new bus();
	
	//Vehicle vehicle = new Taxi();
	public void drive(Vehicle vehicle) {
		//참조변수.run()
		vehicle.run();
	}
}
