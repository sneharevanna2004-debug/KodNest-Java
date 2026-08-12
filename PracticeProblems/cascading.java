
    import java.util.Scanner;

public class cascading{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline character

        String fullName = scanner.nextLine();
        String city = scanner.nextLine();

        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        scanner.close();
    }
}
    

