
    import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class InitializeStudentName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read full name from input
        String name = scanner.nextLine();
        
        // Create Student object using the constructor
        Student s = new Student(name);
        
        // Call display method
        s.display();
    }
}
    

