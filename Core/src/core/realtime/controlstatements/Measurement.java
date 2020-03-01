package core.realtime.controlstatements;

import java.util.Scanner;

public class Measurement {
	static float length;
	static float breadth;
	static float radius;
	static Scanner scan = new Scanner(System.in);
	
	static void circleInput() {
		System.out.println("Enter the radius");
		radius = scan.nextFloat();
	}
	static void rectangleInput() {
		System.out.println("Enter the length");
		 length = scan.nextFloat();
		System.out.println("Enter the breadth");
		 breadth = scan.nextFloat();
	}
	public static void main(String[] args) {
		System.out
				.println("1.Area of circle\n2.perimeter of circle" + "\n3.Area of rectangle\n4.perimeter of rectangle");
		System.out.println("kindly enter the option");
		int option = scan.nextInt();
		
		switch (option) {
		case 1:
			circleInput();
			double area = AreaCalculator.areaOfCircle(radius);
			System.out.println("the area of the circle is " + area);
		break;
		case 2:
			circleInput();
			double perimeter = PerimeterCalculation.perimeterOfCircle(radius);
			System.out.println("the perimeter of the circle is " + perimeter);
		break;
		case 3:
			rectangleInput();
			double areaRectangle = AreaCalculator.areaOfRectangle(length, breadth);
			System.out.println("the area of the rectangle is " + areaRectangle);
		break;
		case 4:
			rectangleInput();
			double perimeterRectangle = PerimeterCalculation.perimeterOfRectangle(length, breadth);
			System.out.println("the perimeter of the rectangle is " + perimeterRectangle);
		break;
		default:
			System.out.println("kindly enter the valid option");
			break;
		}
		System.out.println("please welcome");
		scan.close();
	}

}
