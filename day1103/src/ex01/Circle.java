package ex01;

public class Circle extends Shape {

	public Circle(int radius) {
		super(radius);
		
	}

	@Override
	public double getArea() {
		
		return (double)radius * radius *3.14;
	}

}
