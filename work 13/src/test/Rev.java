package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Rev extends JFrame {
    private JTextField nameField, idField, programField, yearField;
    private JButton submitButton, resetButton;

    public Rev() {
        setTitle("Student Information Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Student ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Program of Study:"));
        programField = new JTextField();
        add(programField);

        add(new JLabel("Year of Study:"));
        yearField = new JTextField();
        add(yearField);

        
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        add(submitButton);
        add(resetButton);

        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveStudentData();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });
    }

    private void saveStudentData() {
        String name = nameField.getText().trim();
        String id = idField.getText().trim();
        String program = programField.getText().trim();
        String year = yearField.getText().trim();

        if (name.isEmpty() || id.isEmpty() || program.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt", true))) {
            writer.write(name + ", " + id + ", " + program + ", " + year);
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            resetFields();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetFields() {
        nameField.setText("");
        idField.setText("");
        programField.setText("");
        yearField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Rev().setVisible(true);
        });
    }

    
    public static class FileHandler {
        private String filename;

        public FileHandler(String filename) {
            this.filename = filename;
        }

        public void writeToFile(String data) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                writer.write(data);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
