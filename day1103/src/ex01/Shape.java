package ex01;

public abstract class Shape {

	public int width;
	public int height;
	public int radius;
	
	
	public Shape(int radius) {

		this.radius = radius;//반지름	
	}

	public Shape(int width, int height) {

		this.width = width;//가로
		this.height = height;//세로
	}
	

	public abstract double getArea ();
	
}
