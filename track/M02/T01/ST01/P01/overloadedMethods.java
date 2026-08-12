
    import java.util.Scanner;

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class overloadedMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String word = scanner.next();

        // Create one Printer object
        Printer printer = new Printer();

        // Call both show() methods
        printer.show(number);
        printer.show(word);
    }
}

