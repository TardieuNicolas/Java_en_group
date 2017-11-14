package std;

import java.awt.*;
import javax.swing.*;

public class Form extends JPanel {
    private JPanel pan = new JPanel();
    JTextField tFirst = new JTextField("");
    JTextField tLast = new JTextField("");
    JTextField tAge = new JTextField("");
    JTextField tEntry = new JTextField("");
    JTextField tJob = new JTextField("");
    JTextField tSalary = new JTextField("");

    private JLabel labelFirst = new JLabel("Name: ");
    private JLabel labelLast = new JLabel("Last Name: ");
    private JLabel labelAge = new JLabel("Age:  ");
    private JLabel labelEntry = new JLabel("Entry Date");
    private JLabel labelJob = new JLabel("Job");
    private JLabel labelSalary = new JLabel("Salary");

    private JButton bouton1 = new JButton("Back");
    private JButton bouton2 = new JButton("Submit");


    public Form(JFrame frame) {
        frame.setTitle("Fenetre Java");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel top = new JPanel();
        tFirst.setPreferredSize(new Dimension(700,30));
        top.add(labelFirst);
        top.add(tFirst);
        pan.add(top, BorderLayout.NORTH);

        JPanel top2 = new JPanel();
        tLast.setPreferredSize(new Dimension(680,30));
        top2.add(labelLast);
        top2.add(tLast);
        pan.add(top2, BorderLayout.NORTH);

        JPanel top3 = new JPanel();
        tAge.setPreferredSize(new Dimension(700,30));
        top3.add(labelAge);
        top3.add(tAge);
        pan.add(top3, BorderLayout.NORTH);

        JPanel top4 = new JPanel();
        tEntry.setPreferredSize(new Dimension(700,30));
        top4.add(labelEntry);
        top4.add(tEntry);
        pan.add(top4, BorderLayout.NORTH);

        JPanel top5 = new JPanel();
        tJob.setPreferredSize(new Dimension(700,30));
        top5.add(labelJob);
        top5.add(tJob);
        pan.add(top5, BorderLayout.NORTH);

        JPanel top6 = new JPanel();
        tSalary.setPreferredSize(new Dimension(700,30));
        top6.add(labelSalary);
        top6.add(tSalary);
        pan.add(top6, BorderLayout.NORTH);

        //tableau
        Object[][] data = {
                {"Malord", "8", "Fr"},
                {"Max", "89", "Fr"},
                {"Mrax", "17", "Esp"},
                {"Maxehg", "2", "Gr"},
                {"Mafrex", "25", "Sr"}
        };



        //nos boutons
        pan.add(bouton1);
        pan.add(bouton2);

        //on pose le tout
        frame.setContentPane(pan);

        bouton1.addActionListener(tab -> {
            frame.getContentPane().removeAll();
            Accueil pute = new Accueil(frame);
            frame.getContentPane().add(pute);
            frame.revalidate();
            frame.repaint();
        });

        bouton2.addActionListener(e -> {
                    data[0][0] = (tFirst.getText());
                    data[0][1] = (tLast.getText());
                    data[0][2] = (tAge.getText());
                    data[0][3] = (tLast.getText());
                    data[0][4] = (tLast.getText());
                    data[0][5] = (tLast.getText());
                }
        );

        frame.setVisible(true);
    }
}