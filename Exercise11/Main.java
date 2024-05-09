package Exercise11;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		Cylinder cylinder = new Cylinder(8, 15);
		
		
		circle.draw();
		System.out.println("Area: " + circle.calculateArea() + "\n");
		cylinder.draw();
		System.out.println("Area: " + cylinder.calculateArea());
		
	}

}
