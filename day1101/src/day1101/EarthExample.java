package day1101;

public class EarthExample {

	public static void main(String[] args) {
		
		//필드가 static으로 선언되어 있으므로
		//클래스명.필드명으로 접근 가능
		System.out.println("지구의 반지름:" + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적:" + Earth.EARTH_AREA + "km");
	}

}
