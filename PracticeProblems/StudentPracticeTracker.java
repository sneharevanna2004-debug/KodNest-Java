public class StudentPracticeTracker {
    public class Student {
    // Instance variables
    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    // Method to set basic details
    public void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    // Method to set initial progress
    public void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name : " + this.name);
        System.out.println("Course Name  : " + this.courseName);
    }

    // Method to display current progress
    public void displayProgress() {
        System.out.println("Completed Topics : " + this.completedTopics);
        System.out.println("Questions Solved : " + this.questionsSolved);
    }

    // Method to add newly completed topics
    public void addTopics(int newTopics) {
        this.completedTopics += newTopics;
        System.out.println("Topics updated successfully.");
        System.out.println("Total Completed Topics : " + this.completedTopics);
    }

    // Method to add newly solved questions
    public void addQuestions(int newQuestions) {
        this.questionsSolved += newQuestions;
        System.out.println("Questions updated successfully.");
        System.out.println("Total Questions Solved : " + this.questionsSolved);
    }
}
}
