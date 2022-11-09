package day1107.exam12;

public class AnonymousExample {
	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		
		anony.field.start();
		anony.method1();
		//3.메서드 매개변수로 익명 자식 클래스를 대입
		anony.method2(new Worker() {

			@Override
			public void start() {
				System.out.println("테스트를 합니다.");
			}
			
		});
		

	}

}
