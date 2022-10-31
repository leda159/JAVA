package day1031;

//객체 : 현실세계에 존재하는 사물
//객체는 속성과 동작으로 구성되어있다.

//클래스 : 객체를 프로그래밍적으로 구현한 설계도

//인스턴스 : 

//학생이라는 객체를 구현한 Student 클래스
public class Student {

	//1.속성 (필드=맴버변수=인스턴스변수)
	public String name;
	public int age;
	public String addr;
	
	//2.생성자(클래스 초기화를 담당)
	//매개변수가 하나도 없는 생성자 : 기본생성자
	//기본 생성자는 선언을 하지 않더라도 컴파일에서 오류가 안난다.
	//오버로딩(매개변수가 다른 이름이 같은 메서드)으로 여러개의 생성자 생성 가능
	public Student() {}
	
	public Student(String name) {
		
		this.name = name;
	}
	
	public Student(String name, int age, String addr) {
	
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//3.동작(=메서드)
	//메서드는 반드시 리턴타입 존재
	//리턴 타입이 없을땐 void 사용
	public void StudentInfo() {
		System.out.println("학생이름:" + name);
		System.out.println("학생나이:" + age);
		System.out.println("학생주소:" + addr);
	}
}





