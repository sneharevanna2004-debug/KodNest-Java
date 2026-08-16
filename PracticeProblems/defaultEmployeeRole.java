import java.util.Scanner;

class Employee {
    String name;
    String role;

    Employee() {
        this.role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}

public class defaultEmployeeRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Employee e = new Employee();
        e.name = name;
        e.displayProfile();
    }
}