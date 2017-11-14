package std;

import javax.swing.*;

public class Accueil extends JPanel{
    public Accueil(JFrame frame){

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JButton bouton = new JButton("FORMULAIRE");
        JButton tableau = new JButton("TABLEAU");
        JPanel conteneur = new JPanel();
        conteneur.add(bouton);
        conteneur.add(tableau);
        frame.setContentPane(conteneur);


        bouton.addActionListener(tab -> {
            frame.getContentPane().removeAll();
            Form ajouterEmploye = new Form(frame);
            frame.getContentPane().add(ajouterEmploye);
            frame.revalidate();
            frame.repaint();
        });

        tableau.addActionListener(tab -> {
            frame.getContentPane().removeAll();
            Dashboard affichage = new Dashboard(frame);
            frame.getContentPane().add(affichage);
            frame.revalidate();
            frame.repaint();
        });
    }
}
