import java.awt.*;

class FrameEx {
    Button b1;

    FrameEx() {
        Frame fr = new Frame();
        b1 = new Button("Submit");
        b1.setBounds(100, 250, 100, 100);
        fr.add(b1);

        fr.setTitle("Button Example");
        fr.setSize(200, 500);
        fr.setLayout(null);
        fr.setVisible(true);
    }

    public static void main(String s[]) {
        FrameEx f1 = new FrameEx();
    }
}