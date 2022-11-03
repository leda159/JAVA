package ex06;

//인터페이스 InterfaceC를 가지고 구현된 구현객체
public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("메소드A 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("메소드B 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("메소드C 실행");
		
	}

}
