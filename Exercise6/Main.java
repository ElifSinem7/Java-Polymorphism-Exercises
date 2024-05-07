package Exercise6;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle(7);
		Rectangle rectangle = new Rectangle(14.4, 19.7);
		Triangle triangle = new Triangle(12.4, 15, 12.4, 14, 18);
		
		System.out.println("***** Areas and Perimeters *****");
		System.out.println("Circle" + "\nArea: " + circle.getArea() + "\nPerimeter: " + circle.getPerimeter());
		System.out.println("\nRectangle" + "\nArea:" + rectangle.getArea() + "\nPerimeter: " + rectangle.getPerimeter());
		System.out.println("\nTriangle" + "\nArea: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter());
	}

}
