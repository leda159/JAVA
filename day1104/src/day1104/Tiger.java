package day1104;

public class Tiger implements Animal {

	//필드
	public String name;

	public Tiger(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.println(name + "는 네발로 걸어다닌다.");
	}

	@Override
	public void cry() {
		System.out.println(name + "는 어흥하고 운다.");
	}

}
