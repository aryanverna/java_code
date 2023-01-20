import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
  // Create the buttons and text field
  private JButton[] buttons = new JButton[10];
  private JButton addButton = new JButton("+");
  private JButton subtractButton = new JButton("-");
  private JButton multiplyButton = new JButton("*");
  private JButton divideButton = new JButton("/");
  private JButton equalsButton = new JButton("=");
  private JTextField resultField = new JTextField();

  // Create the panel to hold the buttons
  private JPanel buttonPanel = new JPanel();

  // Create the calculator's state variables
  private double result = 0;
  private String operator = "=";
  private boolean start = true;

  public Calculator() {
    // Set the title and default close operation
    setTitle("Simple Calculator");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Set the layout manager for the button panel
    buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

    // Add the buttons and text field to the content pane
    Container contentPane = getContentPane();
    contentPane.add(resultField, BorderLayout.NORTH);
    contentPane.add(buttonPanel, BorderLayout.CENTER);

    // Add the digit buttons
    for (int i = 9; i >= 0; i--) {
      buttons[i] = new JButton(String.valueOf(i));
    }
    for (int i = 9; i >= 0; i--) {
      buttonPanel.add(buttons[i]);
    }

    // Add the operator buttons
    buttonPanel.add(addButton);
    buttonPanel.add(subtractButton);
    buttonPanel.add(multiplyButton);
    buttonPanel.add(divideButton);
    buttonPanel.add(equalsButton);

    // Add action listeners for the buttons
    for (int i = 0; i < 10; i++) {
      buttons[i].addActionListener(this);
    }
    addButton.addActionListener(this);
    subtractButton.addActionListener(this);
    multiplyButton.addActionListener(this);
    divideButton.addActionListener(this);
    equalsButton.addActionListener(this);

    // Pack the frame and set its location
    pack();
    setLocationRelativeTo(null);
  }

  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();

    if ('0' <= command.charAt(0) && command.charAt(0) <= '9') {
      // The user entered a digit
      if (start) {
        resultField.setText(command);
        start = false;
      } else {
        resultField.setText(resultField.getText() + command);
      }
    } else {
      // The user entered an operator
          // The user entered an operator
    if (start) {
        if (command.equals("-")) {
          resultField.setText(command);
          start = false;
        } else {
          operator = command;
        }
      } else {
        double x = Double.parseDouble(resultField.getText());
        calculate(x);
        operator = command;
        start = true;
      }}
    }
  
    public void calculate(double n) {
      if (operator.equals("+")) {
        result += n;
      } else if (operator.equals("-")) {
        result -= n;
      } else if (operator.equals("*")) {
        result *= n;
      } else if (operator.equals("/")) {
        result /= n;
      } else if (operator.equals("=")) {
        result = n;
      }
      resultField.setText(String.valueOf(result));
    }
  
    public static void main(String[] args) {
      Calculator frame = new Calculator();
      frame.setVisible(true);
    }
  }
  
