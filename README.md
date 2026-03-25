Project Overview

This is a simple Java console application that calculates total marks, average marks, grade, and pass/fail status for multiple subjects. It is ideal for learning conditional logic, loops, and user input handling in Java.

Features
Accepts marks for multiple subjects from the user.
Calculates total and average marks.
Determines the grade based on the average:
80–100 → A
70–79 → B
60–69 → C
50–59 → D
Below 50 → E
Determines pass/fail (pass if average ≥ 50, fail otherwise).
Easy-to-run console-based interface.
Prerequisites
Java JDK 17 or later installed on your machine.
A text editor or IDE like IntelliJ IDEA, Eclipse, or VS Code.
How to Run
Open your IDE or text editor.
Create a new file named GradeCalculator.java.
Copy the following code into the file:
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double mark = scanner.nextDouble();
            total += mark;
        }

        double average = total / subjects;
        String grade = getGrade(average);
        String status = (average >= 50) ? "Pass" : "Fail";

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
Save the file.
Open the terminal and navigate to the folder containing GradeCalculator.java.

Compile the code:

javac GradeCalculator.java

Run the program:

java GradeCalculator
Enter the number of subjects and marks as prompted. The program will display the total, average, grade, and pass/fail status.
Example Run
Enter the number of subjects: 3
Enter marks for subject 1: 85
Enter marks for subject 2: 70
Enter marks for subject 3: 60

Total Marks: 215.0
Average Marks: 71.66666666666667
Grade: B
Status: Pass
