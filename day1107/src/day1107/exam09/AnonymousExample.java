package day1107.exam09;

public class AnonymousExample {
	public static void main(String[] args) {

		//인스턴스 생성
		Anonymous anony = new Anonymous();
		
		//필드값으로 익명 자식 클래스를 선언
		anony.field.wake();
		
		//로컬변수로 익명 자식 클래스를 선언
		anony.method1();
		
		//매개변수로 익명 자식클래스를 선언
		anony.method2(new Person() {
			
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
			
		});

	}

}
