package exam05;

public class Child extends Parent {

	private String name;
	
	//기본생성자
	public Child() {
		this("홍길동");//Child 클래스의 매개변수 1개짜리 생성자 호출
		//4
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		//3
		System.out.println("Child(String name) call");
	}
}
