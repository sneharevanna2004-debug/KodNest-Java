package Array;


import java.util.Scanner;

public class serachReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. Read array size
        int size = scan.nextInt();
        
        // 2. Read array elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        // 3. Read target value
        int target = scan.nextInt();
        
        // 4. Perform linear search and stop after first match
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                break; // Stop search immediately
            }
        }
        
        // 5. Print search result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        // 6. Print array in reverse order without modifying the original array
        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i == 0 ? "" : " "));
        }
        System.out.println();
        
        scan.close();
    }
}
