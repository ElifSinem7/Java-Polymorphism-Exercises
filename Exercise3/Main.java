package Exercise3;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle(7.8);
		Rectangle rectangle = new Rectangle(13.4, 16.9);
		Triangle triangle = new Triangle(15.3, 18.8);
		
		System.out.println("***** Areas' of the Some Shapes *****");
		System.out.println("Circle's Area: " + circle.calculateArea() + "\nRectangle's Area: " + rectangle.calculateArea() + "\nTriangle's Area: " + triangle.calculateArea());
	}

}
