package day1031;

public class Rectangle {

	public int width;//가로
	public int height;//세로
	
	public Rectangle() {}
	
	public Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	//면적을 계산하여 리턴
	public int getArea() {
		return width * height;
	}
	
}




