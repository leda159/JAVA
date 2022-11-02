package day1102;

public class Cat extends Animal {

	
	public Cat(String name, String age) {
		
		//부모클래스의 매개변수 2개짜리 생성자를 호출함
		super(name, age);
	
	}

	
	
	
	//메서드 재정의``
	@Override
	public void walk() {
		System.out.println(name + "은" + age + "살이고 네발로 뛰어다닌다.");
	}

	@Override
	public void cry() {
		System.out.println(name + "은" + age + "살이고 야옹하고 운다.");
	}


}
