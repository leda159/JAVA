package day1107.exam10;

public class AnonymousExample {
	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		anony.field.turnOn();
		
		anony.method1();
		
		//메서드에 익명 구현 객체를 매개변수로 전달
		anony.method2(
			new RemoteControl() {

				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
				}
	
				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
				}
					
					
			}
		);

	}

}
