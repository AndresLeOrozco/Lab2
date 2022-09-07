import javax.swing.*;

public class EjemploJList {
    EjemploJList(){
        JFrame a = new JFrame("ejemplo");
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("Primero");
        l.addElement("Segundo");
        JList<String> b = new JList< >(l);
        b.setBounds(100,100,75,75);
        a.add(b);
        a.setSize(400,400);
        a.setVisible(true);
        a.setLayout(null);
    }

    public static void main(String[] args) {
        new EjemploJList();
    }
}
