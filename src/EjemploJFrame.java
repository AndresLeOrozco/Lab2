import javax.swing.*;

public class EjemploJFrame {
    public static void main(String[] args) {
        JFrame a = new JFrame("Example");
        a.setSize(600,300);

        JButton b = new JButton("click here");
        b.setBounds(70,140,70,30);

        JTextField c = new JTextField("Texto");
        c.setBounds(20,100,200,30);


        a.add(c);
        a.add(b);

        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
