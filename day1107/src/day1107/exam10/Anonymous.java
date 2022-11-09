package day1107.exam10;

//익명 구현 객체 선언 방법 3가지
public class Anonymous  {
	
	//1.필드에 익명 구현 객체 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};	

	//2.로컬변수(지역변수)에 익명 구현 객체를 대입하는 방식
	void method1() {
			//로컬변수
			RemoteControl localVar = new RemoteControl() {

				@Override
				public void turnOn() {
					System.out.println("Audio를 켭니다.");
				}

				@Override
				public void turnOff() {
					System.out.println("Audio를 끕니다.");
				}
			};
			
			localVar.turnOn();
		}

		//3.익명구현객체를 메서드의 매개변수로 전달
		void method2(RemoteControl rc) {
			rc.turnOn();
		}
}



