class College {
    String collegeName;
    String location;
}

class Department extends College {
    String departmentName;

    void displayDInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
        System.out.println("Department Name: " + departmentName);
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        Department d1 = new Department();

        d1.collegeName = "XYZ Engineering College";
        d1.location = "ABC";
        d1.departmentName = "ECE";

        
        d1.displayDInfo();
    }
}
