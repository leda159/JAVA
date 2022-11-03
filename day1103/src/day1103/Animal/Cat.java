package day1103.Animal;

//자식 클래스
public class Cat extends Animal {

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");		
	}

}
