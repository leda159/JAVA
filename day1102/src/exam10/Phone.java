package exam10;

public abstract class Phone {

	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
	
	//추상 메서드
	//{}블록이 없는 메서드
	//추상 메서드를 사용할려면 abstract를 클래스 앞에 넣어줘야 한다.
	public abstract int add(int num1, int num2); 
}



//==추상클래스==

//-목적
//  여러클래스의 공통적인 필드와 메서드를 추출하여
//  규격을 정한 클래스
//
//-1개이상의 추상메서드를 가진 클래스
//-추상클래스는 new 연산자를 사용불가
//-일반 클래스처럼 필드,생성자,메서드 선언 가능
//-다른 클래스가 상속을 받아 추상메서드를 완벽하게 오버라이딩 한다
//  (부모클래스의 역할을 수행)
//-부모클래스의 역할을 수행
//-추상 클래스에는 반드시 생성자가 있어야한다
//  (상속을 받은 자식클래스에서 super() 호출을 할수 있기 때문) 














