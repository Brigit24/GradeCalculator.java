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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculatorGUI {

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Student Grade Calculator");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center the window

        // Use a panel with GridBagLayout to center everything
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(230, 240, 255)); // light soft blueish background
        frame.add(panel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Label for instructions
        JLabel label = new JLabel("Enter marks for 3 subjects:");
        label.setHorizontalAlignment(JLabel.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // span two columns
        panel.add(label, gbc);

        // Text fields for marks
        JTextField mark1 = new JTextField(10);
        gbc.gridy = 1;
        panel.add(mark1, gbc);

        JTextField mark2 = new JTextField(10);
        gbc.gridy = 2;
        panel.add(mark2, gbc);

        JTextField mark3 = new JTextField(10);
        gbc.gridy = 3;
        panel.add(mark3, gbc);

        // Button to calculate grade
        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.setBackground(new Color(0, 102, 204)); // bright blue
        calculateBtn.setForeground(Color.WHITE); // white text
        calculateBtn.setFocusPainted(false); // remove focus border
        gbc.gridy = 4;
        panel.add(calculateBtn, gbc);

        // Label for results
        JLabel resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        gbc.gridy = 5;
        panel.add(resultLabel, gbc);

        // Action for button click
        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double m1 = Double.parseDouble(mark1.getText());
                    double m2 = Double.parseDouble(mark2.getText());
                    double m3 = Double.parseDouble(mark3.getText());

                    double total = m1 + m2 + m3;
                    double average = total / 3;

                    String grade;
                    if (average >= 80) grade = "A";
                    else if (average >= 70) grade = "B";
                    else if (average >= 60) grade = "C";
                    else if (average >= 50) grade = "D";
                    else grade = "E";

                    String status = (average >= 50) ? "PASS" : "FAIL";

                    resultLabel.setText("<html>Total: " + total + "<br>Average: " + average +
                                        "<br>Grade: " + grade + "<br>Status: " + status + "</html>");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        frame.setVisible(true);
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
