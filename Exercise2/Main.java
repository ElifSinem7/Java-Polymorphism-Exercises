package Exercise2;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();
		
		System.out.println("Car's initial speed: "  + car.getSpeed());
		System.out.println("Motorcycle's initial speed: " + motorcycle.getSpeed());
		
		car.speedUp();
		motorcycle.speedUp();
		
		System.out.println("\nCar's speed after getting speed up: " + car.getSpeed());
		System.out.println("Motorcycle's speed after getting speed up: " + motorcycle.getSpeed());

	}

}
