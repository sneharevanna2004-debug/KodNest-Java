package Array;
import java.util.Scanner;
public class analyzeRuntimeData {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Create an integer array of size 5
        int[] readings = new int[5];
        
        // 2. Read five integer values into the array
        for (int i = 0; i < readings.length; i++) {
            readings[i] = scanner.nextInt();
        }
        
        // 3. Calculate total using another loop
        int total = 0;
        for (int i = 0; i < readings.length; i++) {
            total += readings[i];
        }
        
        // 4. Print the final total
        System.out.println("Total: " + total);
        
        scanner.close();
    }
}

