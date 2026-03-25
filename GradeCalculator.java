import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculatorGUI {

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Student Grade Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Set background color of the frame
        frame.getContentPane().setBackground(new Color(230, 240, 255)); // light soft blueish background

        // Label for instructions
        JLabel label = new JLabel("Enter marks for 3 subjects:");
        label.setBounds(50, 20, 300, 25);
        frame.add(label);

        // Text fields for marks
        JTextField mark1 = new JTextField();
        mark1.setBounds(50, 50, 100, 25);
        frame.add(mark1);

        JTextField mark2 = new JTextField();
        mark2.setBounds(50, 80, 100, 25);
        frame.add(mark2);

        JTextField mark3 = new JTextField();
        mark3.setBounds(50, 110, 100, 25);
        frame.add(mark3);

        // Button to calculate grade
        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.setBounds(50, 150, 120, 30);

        // Set button colors
        calculateBtn.setBackground(new Color(0, 102, 204)); // bright blue
        calculateBtn.setForeground(Color.WHITE); // white text
        calculateBtn.setFocusPainted(false); // remove focus border
        frame.add(calculateBtn);

        // Label for results
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 190, 300, 50);
        frame.add(resultLabel);

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
