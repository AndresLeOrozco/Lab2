import javax.swing.*;
import java.awt.*;

public class EjemploJPanel {
    EjemploJPanel(){
        JFrame a = new JFrame("Panel");
        JPanel b = new JPanel(); //definir un espacio de trabajo de manera mas ordenada
        b.setBounds(60,50,300,350);
        JButton c = new JButton("Click");
        c.setBounds(200,200,80,40);
        b.add(c);
        a.add(b);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);
        b.setBackground(Color.black);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploJPanel();

    }
}
