package ex01;

public class Student {
	//필드
	private String studentNum;
	
	//생성자
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	//메서드
	public String getStudentNum() {
		return studentNum;
	}

	//오버라이드
	//Object 클래스에서는 객체의 주소값을 리턴한다.
	//Override 해서 변경을 해야 한다.
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		
		if(studentNum.equals(student.getStudentNum())) {	
			return true;
		}
		return false;
	}
	
	//다운캐스티을 하기 위해 부모클래스로 부터
	//상속받은 자식클래스인지 여부를 체크
//	if(obj instanceof Student){
	
//		Student s = (Student)obj;
	
//		if(studentNum.equals(student.getStudentNum())) {
//			return true;
//		}
//		return false;
//	 }
	
	
	
	
	
	//Object 클래스에서는 객체의 주소값을 리턴한다.
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}


	
}
