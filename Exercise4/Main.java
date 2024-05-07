package Exercise4;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Manager("Lilo Heidi", 7500.0, 1500.0);
		Employee employee2 = new Programmer("Margrit Cathrin", 5000.0, 600.0);
		
		System.out.println("First Employee: " + employee1.getName() + "\nRole: " + employee1.getRole() + "\nSalary: " + employee1.calculateSalary());
		System.out.println("\nSecond Employee: " + employee2.getName() + "\nRole: " + employee2.getRole() + "\nSalary: " + employee2.calculateSalary());
	}

}
