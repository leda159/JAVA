package day1101;

public class Triangle {

	private int width;//밑변
	private int height;//높이
	
	//생성자
	public Triangle() {}
	
	
	
	
	
	//매개변수를 가지는 생성자
	public Triangle(int width, int height) {
		
		this.width = width;
		this.height = height;
	}




	//면적 메서드
	public double getArea(int width, int height) {
		return (double) width * height * 0.5 ;
	}
	
	
	//Getter/Setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	

	
}
