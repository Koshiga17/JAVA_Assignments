package shapes;
class Square {
	private double side;
	public Square(double side) {
		this.side=side;
	}
	public double calculateArea() {
		return side*side;
	}
	public double calculatePerimeter() {
		return 4*side;
	}
}
class Triangle {
	private double base;
	private double height;
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	public double calculateArea() {
		return 0.5*base*height;
	}
}
class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double calculateArea() {
		return Math.PI * radius*radius;
	}
	public double calculateCircumference() {
		return 2*Math.PI*radius;
	}
}
public class TestShapes {

	public static void main(String[] args) {
		Square sqr=new Square(4);
		System.out.println("Square: ");
		System.out.println("Area: "+sqr.calculateArea());
		System.out.println("Perimeter: "+sqr.calculatePerimeter());
		Triangle tr=new Triangle(5,3);
		System.out.println("\nTriangle:");
		System.out.println("Area: "+tr.calculateArea());
		Circle cr=new Circle(7);
		System.out.println("\nCircle:");
		System.out.println("Area: "+cr.calculateArea());
		System.out.println("Circumference: "+cr.calculateCircumference());
		
		
		
		
		
	}

}
