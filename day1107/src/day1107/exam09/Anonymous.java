package day1107.exam09;

//익명 자식 클래스를 선언하는 방법 3가지
//1.필드값으로 익명 자식클래스를 선언
//2.로컬변수로 익명 자식클래스를 선언
//3.메서드의 매개변수 값으로 익명 자식클래스를 선언
public class Anonymous {

	//(1)익명 자식 클래스를 필드선언
	Person field = new Person() {
		
		//메서드
		void work() {
			System.out.println("출근합니다.");
		}

		//부모클래스의 메서드 오버라이딩
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
		
	};
	
	void method1() {
		
		//(2) 로컬변수로 익명 자식 클래스 선언
		Person localVar = new Person() {

			//익명 자식 클래스의 메서드 선언
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
			
		};
		
		localVar.wake();
	}//
	
	//(3)메서드의 매개변수로 익명 자식 클래스를 전달
	void method2(Person person) {
		person.wake();
	}
	
}




