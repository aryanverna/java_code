import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseEventExample2 extends JFrame implements MouseMotionListener {
  private JPanel panel;
  private JTextField textField;

  public MouseEventExample2() {
    panel = new JPanel();
    textField = new JTextField(20);
    panel.add(textField);
    add(panel);

    // Add the mouse motion listener to the panel
    panel.addMouseMotionListener(this);

    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new MouseEventExample();
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    // Update the text field with the current mouse position
    textField.setText("Mouse position: (" + e.getX() + ", " + e.getY() + ")");
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    // Not needed for this example
  }
}
