package Array;


import java.util.Scanner;

public class displayMartix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read rows and columns dynamically
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        
        // Initialize array using input dimensions
        int[][] a = new int[rows][cols];
        
        // Read matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        
        // Print matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}

