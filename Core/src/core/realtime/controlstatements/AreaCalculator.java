package core.realtime.controlstatements;

public class AreaCalculator {
	static final double PI = 3.14;

	static double areaOfCircle(float radius) {
		double area = PI * Math.pow(radius, 2);
		return area;
	}
	static double areaOfRectangle(float length , float breadth) {
		double area = length* breadth;
		return area;
	}
	
}
