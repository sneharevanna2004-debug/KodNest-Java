import java.util.Scanner;

class PracticeTask {
    int id;
}

public class objectReference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three PracticeTask objects
        PracticeTask first = new PracticeTask();
        PracticeTask second = new PracticeTask();
        PracticeTask third = new PracticeTask();

        // Read their IDs in order
        first.id = scanner.nextInt();
        second.id = scanner.nextInt();
        third.id = scanner.nextInt();

        // Step 1: Store the first object's ID in unreachableId
        int unreachableId = first.id;

        // Step 2: Create relay reference and assign first to it
        PracticeTask relay = first;

        // Step 3: Assign second to first
        first = second;

        // Step 4: Assign third to second
        second = third;

        // Step 5: Assign second to relay
        relay = second;

        // Step 6: Assign first to third
        third = first;

        // Print final output format
        System.out.println("First Reference: " + first.id);
        System.out.println("Second Reference: " + second.id);
        System.out.println("Third Reference: " + third.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableId);
    }
}