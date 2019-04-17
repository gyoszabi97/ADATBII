package hu.adatb.view;

import hu.adatb.dao.Adatbazis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lekerdezes2Dialog extends JDialog implements ActionListener {
    private JTextArea tf_lekerdez2;
    private JPanel panel_lekerdez2;
    private JButton button_lekerdez2;

    private Adatbazis adatbazis;

    public Lekerdezes2Dialog(Frame szuloAblak){
        super(szuloAblak, "Lekérdezés listázésa");

        this.tf_lekerdez2 = new JTextArea();
        this.button_lekerdez2 = new JButton("Listázás");

        this.panel_lekerdez2 = new JPanel();
        this.panel_lekerdez2.setLayout(new BorderLayout());

        this.panel_lekerdez2.add(tf_lekerdez2, BorderLayout.CENTER);
        this.panel_lekerdez2.add(button_lekerdez2, BorderLayout.SOUTH);

        this.button_lekerdez2.addActionListener(this);
        this.getContentPane().add(panel_lekerdez2);

        this.pack();
        this.setSize(600, 400);

    }

    public void elokeszit(){
        this.tf_lekerdez2.setText("");

    }

    public void setAdatbazis(Adatbazis adatbazis){
        this.adatbazis = adatbazis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //String eredmeny = adatbazis.hallgatotLekerdez();
        //tf_lekerdez.setText(eredmeny);
    }
}
