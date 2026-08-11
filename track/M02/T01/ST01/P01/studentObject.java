import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double javaScore;
}

public class studentObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student s = new Student();
        
        s.id = scanner.nextInt();
        s.name = scanner.next();
        s.course = scanner.next();
        s.javaScore = scanner.nextDouble();
        
        System.out.println("Student Profile");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaScore);
    }
}