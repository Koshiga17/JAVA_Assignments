package com.cts;
class Shape {
	public double area(double side) {
		return side*side;
	}
	public double area(double length,double width) {
		return length*width;
	}
	public double perimeter(double side) {
		return 4*side;
	}
	public double perimeter(double length,double width) {
		return 2*(length+width);
	}
}
public class OverloadingShapes {

	public static void main(String[] args) {
		Shape shape=new Shape();
		double sqrSide=5.0;
		System.out.println("Square:");
		System.out.println("Area: "+shape.area(sqrSide));
		System.out.println("Perimeter: "+shape.perimeter(sqrSide));
		double rectangleLength=6.0;
		double rectangleWidth=4.0;
		System.out.println("\nRectangle:");
		System.out.println("Area: "+shape.area(rectangleLength,rectangleWidth));
		System.out.println("Perimeter: "+shape.perimeter(rectangleLength,rectangleWidth));
		

	}

}
