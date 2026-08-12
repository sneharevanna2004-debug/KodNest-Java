
    import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class calculateTotalOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator calculator = new ResultCalculator();

        // Call both overloaded methods
        int twoMarkTotal = calculator.getTotal(first, second);
        int threeMarkTotal = calculator.getTotal(first, second, third);

        // Print both totals
        System.out.println("Two-Mark Total: " + twoMarkTotal);
        System.out.println("Three-Mark Total: " + threeMarkTotal);
    }
}

