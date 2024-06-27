package exercise01;

public class Triangle extends Shape {
	protected double sideA;
	protected double sideB;
	protected double sideC;
	
	public Triangle (double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	double getPerimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	double getArea() {
		// Calculate the semi-perimeter
        double p = (sideA + sideB + sideC) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        
        return area;
	}

	@Override
	void printResult() {
		System.out.println("-----Rectangle-----");
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.println("Area: " + getArea());	
        System.out.println("Perimeter: " + getPerimeter());
		
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
}
