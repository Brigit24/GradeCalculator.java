import java.util.Scanner;

public class GradeCalculator {

    // Method to calculate grade based on average
    public static String getGrade(double average) {
        if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "E";
    }

    // Method to check pass or fail
    public static String getStatus(double average) {
        return (average >= 50) ? "PASS" : "FAIL";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        double total = 0;

        // Input marks for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double mark = scanner.nextDouble();
            total += mark;
        }

        // Calculations
        double average = total / subjects;
        String grade = getGrade(average);
        String status = getStatus(average);

        // Output
        System.out.println("\n----- RESULTS -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Final Grade: " + grade);
        System.out.println("Status: " + status);
    }
}
