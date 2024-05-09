package Exercise11;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println("Drawing a cylinder...");
	}
	@Override
	public double calculateArea() {
		return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
	}

}
