
    import java.util.Scanner;
    public class personalExpense {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalExpense;

        String status = (remainingAmount >= 0) ? "Within budget" : "Over budget";

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);
        System.out.println("Status: " + status);

        scanner.close();
    }
}

