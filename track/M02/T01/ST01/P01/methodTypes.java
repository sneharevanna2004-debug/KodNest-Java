import java.util.Scanner;

class MethodDemo {
    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class methodTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String name = scanner.next();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        MethodDemo demo = new MethodDemo();

        // Call methods
        demo.sayHello();
        demo.greet(name);
        
        int luckyNumber = demo.getLuckyNumber();
        System.out.println("Lucky Number: " + luckyNumber);

        int sum = demo.add(first, second);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
