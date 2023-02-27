import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    JFrame frame;
    JTextField textField;
    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonClear;

    public Calculator() {
        // Create the frame and set its properties
        frame = new JFrame("Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 4));

        // Create the text field and add it to the frame
        textField = new JTextField();
        textField.setEditable(false);
        frame.add(textField);

        // Create the number buttons and add them to the frame
        button7 = new JButton("7");
        frame.add(button7);
        button8 = new JButton("8");
        frame.add(button8);
        button9 = new JButton("9");
        frame.add(button9);
        buttonDivide = new JButton("/");
        frame.add(buttonDivide);

        button4 = new JButton("4");
        frame.add(button4);
        button5 = new JButton("5");
        frame.add(button5);
        button6 = new JButton("6");
        frame.add(button6);
        buttonMultiply = new JButton("*");
        frame.add(buttonMultiply);