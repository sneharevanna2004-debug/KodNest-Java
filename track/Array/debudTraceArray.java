package Array;

public class debudTraceArray {
   
    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // 1. Snapshot array with manual copy
        int[] snapshot = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // 2. Alias
        int[] liveView = original;

        // 3. Update element through alias
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        // 4. Print Original state on one line
        System.out.print("Original:");
        for (int val : original) {
            System.out.print(" " + val);
        }
        System.out.println();

        // 5. Print Snapshot state on one line
        System.out.print("Snapshot:");
        for (int val : snapshot) {
            System.out.print(" " + val);
        }
        System.out.println();

        // 6. Reference comparison
        System.out.println("Same object: " + (original == liveView));

        // 7. Validate index access
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}

