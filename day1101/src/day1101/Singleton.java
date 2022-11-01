package day1101;
	//싱글톤 패턴
	//애플리케이션이 시작할때 어떤 클래스가 최초 한번만
	//메모리를 할당받아 인스턴스를 생성하고 이후 부터는
	//공유하여 재사용하는 디자인 패턴방식으로 메모리 효율을 높힌다.

public class Singleton {

	//싱글톤 형태를 가진 필드를 정적으로 선언 private으로 선언
	private static Singleton singleton = new Singleton();
	
	//다른 클래스에서 접근하여 new 연산자를 사용하지 못한다.
	//private으로 막아둠
	private Singleton() {}
	
	//다른 클래스에서 공유하여 사용하도록 선언
	//공유해서 재사용 하기때문에 주소는 동일함
	static Singleton getInstance() {
		return singleton;
	}
}
