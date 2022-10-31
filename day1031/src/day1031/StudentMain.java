package day1031;

public class StudentMain {

	public static void main(String[] args) {
		
		//인스턴스 생성
		//참조변수 : 클래스를(주소값을) 가르키고있는 변수 
		//클래스명 참조 변수 = new 생성자명
		//new 연산자를 사용해서 Student 클래스의 인스턴스를 Heap 메모리에
		//생성하고 Student 기본 생성자를 호출하는것
		Student s1 = new Student();
		
		s1.name = "홍길동";
		s1.age = 23;
		s1.addr = "부산시 동래구 온천1동";
		//호출 방법
		s1.StudentInfo();

		
		
		
		
		//인스턴드 생성
		//매개변수 1개짜리 생성자가 호출된다.
		Student s2 = new Student("이순신");
		
		s2.age = 35;
		s2.addr = "경남 김해서";
		//호출 방법
		s2.StudentInfo();
		
		
		
		
		//인스턴스 생성
		//매개변수 3개짜리 생성자가 호출된다.
		Student s3 = new Student("강감찬", 23, "경북안동" );
		//호출 방법
		s3.StudentInfo();
	}

}





