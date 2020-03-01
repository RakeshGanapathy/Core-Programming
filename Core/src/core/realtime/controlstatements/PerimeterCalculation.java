package core.realtime.controlstatements;

public class PerimeterCalculation {
static double perimeterOfCircle(double radius) {
	double perimeter = 2*AreaCalculator.PI*radius;
	return perimeter;
}
static double perimeterOfRectangle(float length , float breadth) {
	double perimeter =2*(length+breadth);
	return perimeter;
}
}
