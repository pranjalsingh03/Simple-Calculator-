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