package day1102;

public class Animal {
	//필드
	String name;
	String age;
	
	
	//생성자
	public Animal(String name, String age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	//메서드
	public void walk() {
		System.out.println("걸어다닌다");
	}
	
	public void cry() {
		System.out.println("운다");
	}
}
