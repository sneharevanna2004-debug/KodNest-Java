
    import java.util.Scanner;

public class groupingAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codingScore = scanner.nextInt();
        int attendance = scanner.nextInt();
        int projects = scanner.nextInt();

        // Check compulsory condition AND either of the alternative conditions
        if (codingScore >= 60 && (attendance >= 75 || projects >= 2)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        scanner.close();
    }
}
    

