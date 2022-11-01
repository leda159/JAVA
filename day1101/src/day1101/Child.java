package day1101;

//자식클래스 (=Sub클래스)
//상속시 주의사항
//1.상속은 부모 클래스가 한개만 선언해야 한다.
//2.상속시 부모클래에 있는 모든 필드를 상속받는데
//  이때 private으로 선언된 필드,메서드는 상속을 제외한다.


//상속을 사용하는 이유?
//중복코드를 줄이고 개발자 유지보수가 용이하도록 하기위해서 사용
public class Child extends Parent {

	//부모 클래스에 있는 information()메서드가 오버라이딩이 된다
	//오버라이딩?
	//부모 클래스를 상속받아 자식 클래스에서 메서드를 
	//재정의 하여 사용하는 기법
	@Override
	public void information() {
		System.out.printf("이름:%s, 나이:%d, 주소:%s\n",name,age,addr);
	}

	
}
