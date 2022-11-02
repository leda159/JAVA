package exam05;

public class ChildExample  {

	public static void main(String[] args) {
		
		//Child의 기본생성자가 호출됨
		Child child = new Child();
		
	}

}

//Child의 기본생성자가 호출됨
//부모 클래스의 
//기본생성자에 this("대한민국"); 실행
//매개변수 1개짜리 생성자ㄹ": 호출함
//Parent(String nation){}; 실행

//자식 클래스의
//기본 생성자에 this("홍길동"); 실행
//매개변수 1개짜리 생성자 호출함
//Child(String name){}; 실행