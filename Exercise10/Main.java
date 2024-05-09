package Exercise10;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();
		
		System.out.println("***** CAR *****");
		car.startEngine();
		car.stopEngine();
		System.out.println("\n***** MOTORCYCLE *****");
		motorcycle.startEngine();
		motorcycle.stopEngine();
	}

}
