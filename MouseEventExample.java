import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample extends JFrame implements MouseListener {

  // Declare a text field for displaying the mouse position
  private JTextField textField;

  public MouseEventExample() {
    // Set the title and size of the frame
    setTitle("Mouse Event Example");
    setSize(300, 200);

    // Add the text field to the frame
    textField = new JTextField();
    add(textField, BorderLayout.NORTH);

    // Add the mouse listener to the frame
    addMouseListener(this);
  }

  // Handle the MOUSE_MOVED event
  public void mouseMoved(MouseEvent e) {
    // Update the text field with the current mouse position
    textField.setText("Mouse position: (" + e.getX() + ", " + e.getY() + ")");
  }

  // Handle the MOUSE_CLICKED event
  public void mouseClicked(MouseEvent e) {
    // Update the text field with the position of the mouse click
    textField.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
  }

  // The following methods must be implemented as part of the MouseListener
  // interface,
  // but we don't need to use them in this example, so they can be left empty
  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public static void main(String[] args) {
    // Create an instance of the MouseEventExample class
    MouseEventExample frame = new MouseEventExample();

    // Show the frame
    frame.setVisible(true);
  }
}