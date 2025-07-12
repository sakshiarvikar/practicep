
public class Person {

	public static void main(String[] args) {
		    Human h1 = new Human();
	        h1.init("Ankita", 30, 60000);
	        System.out.println("\n--- Human 1 Details ---");
	        h1.showDetails();

	        
	        Human h2 = new Human();
	        h2.init();
	        System.out.println("\n--- Human 2 Details ---");
	        h2.showDetails();
		

	}

}

class Human {
    private String name;
    private int age;
    private double salary;

   
    Human() {
        System.out.println("Human object created!");
    }

   
    void init(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }

    
    void init() {
        name = "Sakshi";
        age = 25;
        salary = 50000.00;
    }

    
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getSalary() {
        return salary;
    }

    
    void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: ₹" + getSalary());
    }
}
