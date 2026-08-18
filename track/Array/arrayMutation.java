package Array;

public class arrayMutation {
    public static void main(String[] args) {
        // 1. Assign input values
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        // 2. Create snapshot array with the same length
        int[] snapshot = new int[readings.length];

        // 3. Copy values element-by-element using a loop
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        // 4. Update the element at updateIndex in the main array
        readings[updateIndex] = newValue;

        // 5. Print the snapshot values
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + (i == snapshot.length - 1 ? "" : " "));
        }
        System.out.println();

        // 6. Print the updated readings values
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + (i == readings.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}
