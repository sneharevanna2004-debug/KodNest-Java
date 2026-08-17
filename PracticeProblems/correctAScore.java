
    import java.util.Scanner;

class ScoreEditor {
    void correctScore(int[] scores, int index, int newScore) {
        if (index >= 0 && index < scores.length) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        System.out.print("Scores:");
        for (int score : scores) {
            System.out.print(" " + score);
        }
        System.out.println();
    }
}

    public class correctAScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] scores = new int[size];
        
        for (int i = 0; i < size; i++) {
            scores[i] = scanner.nextInt();
        }
        
        int index = scanner.nextInt();
        int newScore = scanner.nextInt();
        
        ScoreEditor editor = new ScoreEditor();
        editor.correctScore(scores, index, newScore);
        editor.displayScores(scores);
    }
}

