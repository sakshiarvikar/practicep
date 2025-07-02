
class Student {
    private String name;  
    private int age;

   
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encap {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Sakshi");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
