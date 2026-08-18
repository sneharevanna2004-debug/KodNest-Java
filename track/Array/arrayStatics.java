package Array;


    import java.util.Scanner;

public class arrayStatics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. Read the array size
        int size = scan.nextInt();
        
        // 2. Create the integer array using runtime size
        int[] arr = new int[size];
        
        // 3. Read and store all array elements
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        // 4. Initialize minimum and maximum with the first element
        int min = arr[0];
        int max = arr[0];
        
        // 5. Traverse the remaining elements
        for (int i = 1; i < arr.length; i++) {
            // 6. Update minimum whenever a smaller value is found
            if (arr[i] < min) {
                min = arr[i];
            }
            // 7. Update maximum whenever a larger value is found
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // 8. Display the final minimum and maximum values in the required format
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        scan.close();
    }
}
