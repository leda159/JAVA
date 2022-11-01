package day1101;

//부모클래스(= Super클래스)
public class Parent {

	//필드
	public String name;
	public int age;
	public String addr;
	
	
	//기본 생성자
	public Parent() {}
	
	
	//메서드
	public void information() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("주소:" + addr);
	}
}
