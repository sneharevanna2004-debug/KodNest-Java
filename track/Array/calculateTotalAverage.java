package Array;

public class calculateTotalAverage {
    
    public static void main(String[] args) {
        // 1. Create the marks array with given values
        int[] marks = {70, 80, 60, 90, 50};
        
        // 2. Start total with 0
        int total = 0;
        
        // 3. Traverse the array and add every mark to total
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        
        // 4. Divide total by the number of marks using double division
        double average = (double) total / marks.length;
        
        // 5. Print the total and average
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

