package day1108;

public class Student {

	public String name;
	public int age;
	public String addr;
	
	public Student() {}
	
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public void studentInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("주소:" + addr);
	}
	
	
}





