package day1031;

public class StudentMain {
	public static void main(String[] args) {

		//클래스명 참조변수 = new 생성자명();
		//Student 클래스의 인스턴스를 Heap 메모리에
		//생성하고 Student 클래스의 기본생성자를 호출한다.
		Student s1 = new Student();
		
		s1.name = "홍길동";
		s1.age = 23;
		s1.addr = "부산시 동래구 온천1동";
		
		s1.studentInfo();
		
		//매개변수 1개짜리 생성자 호출
		Student s2 = new Student("이순신");
		
		s2.age = 35;
		s2.addr = "경남 김해시";
		
		s2.studentInfo();
		
		Student s3 = new Student("강감찬",45,"경북 안동");
		
		s3.studentInfo();
		
		
	}

}


