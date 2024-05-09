package Exercise8;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle(6);
		Square square = new Square(9);
		Triangle triangle = new Triangle(12, 18.5);
		
		circle.draw();
		System.out.println("Area: " + circle.calculateArea() + "\n");
		square.draw();
		System.out.println("Area: " + square.calculateArea() + "\n");
		triangle.draw();
		System.out.println("Area: " + triangle.calculateArea() + "\n");
	}

}
