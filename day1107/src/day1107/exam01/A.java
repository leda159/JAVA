package day1107.exam01;

//외부 클래스
class A {
	
	//A 클래스 기본생성자 default 선언
	//인스턴스 멤버 클래스 방식으로 선언
	//인스턴스 필드,인스턴스 메서드만 선언 가능
	A() {
		System.out.println("A객체가 생성됨");
	}

	//내부클래스
	class B {
		B() {
			System.out.println("B객체가 생성됨");
		}
	
		int field1;
	
		// static int field2;
	
		void method1() {
		}
	}	
	
	// static void method2() {}
	
	//정적 멤버 클래스로 선언
	//인스턴스 필드,정적 필드,인스턴스 메서드,정적 메서드
	//모두 선언가능
	static class C {
		C() {
			System.out.println("C객체가 생성됨");
		}
	
		int field1;
		static int field2;
	
		void method1() {
		}
	
		static void method2() {
		}
	}

	
	void method() {
		//로컬 클래스로 선언
		//인스턴스 필드,인스턴스 메서드만 선언 가능
		class D {
			D() {
				System.out.println("D객체가 생성됨");
			}

			int field1;
			//static int field2;

			void method1() {
			}

			//static void method2() {}
		}

		D d = new D();

		d.field1 = 3;
		d.method1();

	}
}
