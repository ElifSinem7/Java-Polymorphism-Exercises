package Exercise9;

public class Main {

	public static void main(String[] args) {
		
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Panther panther = new Panther();
		
		System.out.println("***** Lion *****");
		lion.eat();
		lion.sound();
		System.out.println("\n***** Tiger *****");
		tiger.eat();
		tiger.sound();
		System.out.println("\n***** Panther *****");
		panther.eat();
		panther.sound();
	}

}
