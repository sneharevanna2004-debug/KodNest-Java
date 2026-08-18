package Array;


    import java.util.Scanner;

public class frequencyOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the size of the array
        int size = scan.nextInt();

        // Initialize array and read elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Read the target value
        int target = scan.nextInt();

        // Count occurrences using one loop and one equality check
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // Output the frequency report
        System.out.println("Frequency of " + target + ": " + count);
    }
}
