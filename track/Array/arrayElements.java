package Array;
import java.util.Scanner;
public class arrayElements {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the Array elements");
        for(int i=0; i<=a.length-1; i++){
            a[i] = scan.nextInt();
        }
            System.out.println("Array elements are:");
            for(int i=0;i<=a.length-1; i++) {
                System.out.println(a[i]);
        }
    }
}
