package Array;


    public class reorderPlan {
    public static void main(String[] args) {
        // 1. Assign stock array and reorder level
        int[] stock = {4, 12, 2, 9, 5};
        int reorderLevel = 5;

        // 2. Start counter
        int reorderCount = 0;

        // 3. Traverse entire array
        for (int i = 0; i < stock.length; i++) {
            // 4. Increment count when stock is less than or equal to reorderLevel
            if (stock[i] <= reorderLevel) {
                reorderCount++;
            }
        }

        // 5. Output result
        System.out.println("Items to reorder: " + reorderCount);
    }
}

