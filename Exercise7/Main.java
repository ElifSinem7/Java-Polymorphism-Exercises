package Exercise7;

public class Main {

	public static void main(String[] args) {
		
		Animal bird = new Bird();
		Animal panthera = new Panthera();
		
		bird.move();
		bird.makeSound();
		System.out.println("\n");
		panthera.move();
		panthera.makeSound();
	}

}
