package day1102;

public class Tiger extends Animal {


	
	public Tiger(String name, String age) {
		
		//부모클래스의 매개변수 2개짜리 생성자를 호출함
		super(name, age);
	}

	void tigerRun() {
		System.out.println(name + "은" + age + "살이고 네발로 뛰어다닌다.");
	}
	
	void tigerCry() {
		System.out.println(name + "은" + age + "살이고 어흥하고 운다.");
	}
}
