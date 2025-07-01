// Class with private data and public methods
class Student {
    private String name;  // private = encapsulated
    private int age;

    // Setter methods (to set data)
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    // Getter methods (to get data)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encaps {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Sakshi");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
