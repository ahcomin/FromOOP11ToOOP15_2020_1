package GUI;

        import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {//main method
        JFrame f = new JFrame("Hello");
        JFrame p = new JFrame();
        JButton b = new JButton("Press me.");

        f.setSize(400, 400);
        f.setContentPane(p);
        p.add(b);
        f.setVisible(true);
    }
}
