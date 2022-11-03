package RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		//구현객체
		SmartTelevision tv = new SmartTelevision();
		
		//다형성(메서드 오버라이딩 + 타입변환)
		
		//자동타입변환
		//RemoteControl rc = new SmartTelevision();
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(2);
		rc.turnOff();
		
		//자동타입변환
		//Searchable searchable = new SmartTelevision();
		Searchable searchable = tv;
		
		searchable.search("hppt://daum.net");
	}

}
