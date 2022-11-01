package day1101;

public class CarExample {

	public static void main(String[] args) {
	
		//인스턴스가 Heap 동적 메모리에 생성
		Car myCar = new Car();
		
		System.out.println("제작회사:" + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색깔:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeed);
		System.out.println("현재속도:" + myCar.speed);
		
		
		myCar.speed = 60;
		System.out.println("수정된 속도:" + myCar.speed);
	}

}
