import java.util.Scanner;

public class firstMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        // Read the array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Read the target value
        int target = scanner.nextInt();
        
        // Find and display the first matching index
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                index = i;
                break; // Stop after the first match
            }
        }
        
        System.out.println("First index: " + index);
    }
}