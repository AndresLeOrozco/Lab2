import javax.swing.*;

public class EjemploJMenu {
    JMenu menu;
    JMenuItem a1,a2; //se declaran como atributos para poder ponerle un listener

    EjemploJMenu(){
        JFrame a = new JFrame("Ejemplo");
        menu = new JMenu("Opciones");
        JMenuBar m1 = new JMenuBar();
        a1 = new JMenuItem("Ex1");
        a2 = new JMenuItem("Ex2");
        menu.add(a1);
        menu.add(a2);
        m1.add(menu);
        a.setJMenuBar(m1);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);

    }

    public static void main(String[] args) {
        new EjemploJMenu();
    }
}
