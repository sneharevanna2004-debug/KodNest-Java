import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javaScore;
}

public class leranerProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Learner object
        Learner learner1 = new Learner();
        learner1.id = scanner.nextInt();
        learner1.name = scanner.next();
        learner1.javaScore = scanner.nextInt();

        // Create and populate the second Learner object
        Learner learner2 = new Learner();
        learner2.id = scanner.nextInt();
        learner2.name = scanner.next();
        learner2.javaScore = scanner.nextInt();

        // Read the new score
        int newScore = scanner.nextInt();

        // Display both records before the update
        System.out.println("Before Update");
        System.out.println(learner1.id + " - " + learner1.name + " - " + learner1.javaScore);
        System.out.println(learner2.id + " - " + learner2.name + " - " + learner2.javaScore);

        // Update only the first object
        learner1.javaScore = newScore;

        // Display both records after the update
        System.out.println("After Update");
        System.out.println(learner1.id + " - " + learner1.name + " - " + learner1.javaScore);
        System.out.println(learner2.id + " - " + learner2.name + " - " + learner2.javaScore);
    }
}
