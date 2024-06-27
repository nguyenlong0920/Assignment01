package exercise01;

public class Rectangle extends Shape{
	
	protected double width;
	protected double length;
	
	public Rectangle (double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	double getArea() {
		return width * length;
	}

	@Override
	void printResult() {
		System.out.println("-----Rectangle-----");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());	
        System.out.println("Perimeter: " + getPerimeter());
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
}
