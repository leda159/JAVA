package day1107.exam12;

//익명 자식 클래스를 선언 방식 3가지
public class Anonymous {

	//1.필드에 익명 자식클래스 대입
	Worker field = new Worker() {

		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
		
		
	};
			
	void method1() {
		
		//2.지역변수에 익명 자식 클래스 대입
		Worker localVar = new Worker() {

			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
			
		};
				
		localVar.start();		
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}




