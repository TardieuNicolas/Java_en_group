package std;

import javax.swing.*;
import java.awt.*;
import std.Form.*;
public class Dashboard extends JPanel {

    public Dashboard(JFrame frame){
        frame.setTitle("Fenetre Java");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton back = new JButton("back");
        JPanel conteneur = new JPanel();
        conteneur.add(back);
        frame.setContentPane(conteneur);
       // Form.tFirst;
        JTable table = new JTable(new Object[][]{
                {"", "Ex: Prenom", "Ex:Age", 3420,"Ex: Date d'embauche", "Ex:Job"},
                {"Ex:Nom", "Ex: Prenom", "Ex:Age", 5234,"Ex: Date d'embauche", "Ex:Job"},
                {"Ex:Nom", "Ex: Prenom", "Ex:Age", 35435,"Ex: Date d'embauche", "Ex:Job"},
                {"Ex:Nom", "Ex: Prenom", "Ex:Age", 5245,"Ex: Date d'embauche", "Ex:Job"}
        }, new String[]{"Nom", "Prenom", "Age", "Salaire", "Date d'embauche", "Job"});
        int moyenne = 0;

        JPanel moyPan = new JPanel();
        JLabel moyLab = new JLabel("Moyenne des salaires : " + moyenne);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);

        frame.getContentPane().add(moyLab, BorderLayout.EAST);
        frame.getContentPane().add(back, BorderLayout.SOUTH);

        //frame.pack();
        frame.setVisible(true);



        back.addActionListener(tab -> {
            frame.getContentPane().removeAll();
            Accueil ajouterEmploye = new Accueil(frame);
            frame.getContentPane().add(ajouterEmploye);
            frame.revalidate();
            frame.repaint();
        });
    }
}




