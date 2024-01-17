import java.awt.*;
import java.awt.event.*;

class Example2 extends Frame implements ActionListener {
    TextField tf1, tf2, tf3;
    Button b1, b2;

    Example2() {
        tf1 = new TextField();
        tf1.setBounds(50, 100, 100, 40);
        tf2 = new TextField();
        tf2.setBounds(50, 150, 100, 40);
        tf3 = new TextField();
        tf3.setBounds(50, 200, 100, 40);
        tf3.setEditable(false);
        b1 = new Button("ADD");
        b1.setBounds(50, 300, 60, 70);
        b2 = new Button("SUB");
        b2.setBounds(50, 350, 60, 70);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);

        setTitle("Addition and Subtraction Operation");
        setSize(600, 800);
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = 0;
        if (e.getSource() == b1)
            i3 = i1 + i2;
        else if (e.getSource() == b2)
            i3 = i1 - i2;
        String res = String.valueOf(i3);
        tf3.setText(res);
    }

    public static void main(String s[]) {
        Example2 e2 = new Example2();
    }
}