package exercise01;

import java.util.Scanner;

public class ShapeCalculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Rectangle Calculator=====");
        
        // Rectangle
        System.out.print("Please input width of Rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = scanner.nextDouble();
              
        // Circle
        System.out.print("Please input radius of Circle: ");
        double radius = scanner.nextDouble();
        
        //Triangle
        System.out.print("Please input side A of Triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Please input side B of Triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Please input side C of Triangle: ");
        double sideC = scanner.nextDouble();
        
        Rectangle rectangle = new Rectangle(width, length);
        rectangle.printResult();
        
        Circle circle = new Circle(radius);
        circle.printResult();
        
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        triangle.printResult();
        
        scanner.close();
	}
}
