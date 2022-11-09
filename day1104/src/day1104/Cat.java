package day1104;

public class Cat implements Animal {

	//필드
	public String name;
	
	public Cat(String name) {
		this.name = name;
	}

	
	@Override
	public void move() {
		System.out.println(name + "는 두발로 점프한다.");
	}

	@Override
	public void cry() {
		System.out.println(name + "는 야옹하고 운다.");
	}

}
