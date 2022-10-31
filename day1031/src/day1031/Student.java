package day1031;

//학생이라는 객체를 구현한 Student 클래스
public class Student {
	//1.속성(=필드=멤버변수=인스턴스변수)
	public String name;
	public int age;
	public String addr;
	
	//2.생성자(클래스 초기화 담당)
	//기본생성자는 선언을 하지 않더라도 컴파일에서 오류 안남
	//오버로딩으로 생성자를 여러개 선언 가능
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name,int age,String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//3.동작(=메서드)
	//메서드는 반드시 리턴타입 존재
	//void 는 리턴타입인 없는 경우 선언
	public void studentInfo() {
		System.out.println("학생이름:" + name);
		System.out.println("학생나이:" + age);
		System.out.println("학생주소:" + addr);
	}
	
}






