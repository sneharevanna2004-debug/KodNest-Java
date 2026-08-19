
package Array;

import java.util.Scanner;
public class Matrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read rows and columns dynamically
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        
        // Initialize array using input dimensions
        int[][] matrix = new int[rows][cols];
        
        // Read matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        // Print matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}
