import java.util.Scanner;

public class replaceMatchingValues{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        // Read the array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Read target and replacement values
        int target = scanner.nextInt();
        int replacement = scanner.nextInt();
        
        int changes = 0;
        
        // Replace matches in-place and count changes
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                numbers[i] = replacement;
                changes++;
            }
        }
        
        // Print total changes
        System.out.println("Changes: " + changes);
        
        // Print updated array elements separated by spaces
        System.out.print("Updated array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}