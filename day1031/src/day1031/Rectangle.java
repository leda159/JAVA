package day1031;

public class Rectangle {

	//필드
	int width;
	int height;
	
	//생성자
	public Rectangle() {};
	
	//매개변수가 2개인 생성자
	//main 메소드에서 width, height 값을 받아서
	//필드 width, height에 대입
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	};
	
	//메서드
	//면적을 계산하여 리턴함
	//main 메소드에서 받아온 값들이 필드에 저장되어 있으므로
	//그 값들을 꺼내서 width * height 연산을 해서
	//getArea()를 호출한 곳으로 리턴을 함
	public int getArea() {
		return width * height; 
	}
}
