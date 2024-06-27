package exercise01;

public class Circle extends Shape{
	protected double radius;
	
	public Circle (double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	void printResult() {
		System.out.println("-----Circle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());	
        System.out.println("Perimeter: " + getPerimeter());
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
