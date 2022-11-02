package day1102;

public class Triangle extends Shape {

	public Triangle(int width, int height) {
		super(width, height);	
	}

	@Override
	public double getArea() {
		return width * height * 0.5;
	}

}
