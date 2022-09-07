import javax.swing.*;

public class EjemploJSrollBar {
    EjemploJSrollBar(){
        JFrame a = new JFrame("Ejemplo");
        JScrollBar b = new JScrollBar();

        b.setBounds(300,150,40,90);

        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploJSrollBar();
    }
}
