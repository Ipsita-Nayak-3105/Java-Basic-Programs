import java.awt.*;
import java.awt.event.*;

class Example1 extends Frame implements ActionListener {
  TextField tf1;
  Button b1;

  Example1() {
    tf1 = new TextField();
    tf1.setBounds(50, 50, 70, 30);
    b1 = new Button("Show");
    b1.setBounds(50, 70, 10, 20);
    b1.addActionListener(this);
    add(tf1);
    add(b1);

    setTitle("Show message");
    setSize(500, 800);
    setVisible(true);
    setLayout(null);
  }

  public void actionPerformed(ActionEvent e) {
    tf1.setText("GIETU");
  }

  public static void main(String s[]) {
    Example1 e1 = new Example1();
  }
}