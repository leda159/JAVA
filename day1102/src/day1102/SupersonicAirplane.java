package day1102;

//자식 클래스
public class SupersonicAirplane extends Airplane {
	
	//상수선언(대문자 선언)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//비행모드(일반)
	public int flyMode = NORMAL;

	//오버라이딩
	//부모에게서 상속받아서 자식클래스에서 재정의하는 것
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}else {
			super.fly();
		}
	}
	
	

}
