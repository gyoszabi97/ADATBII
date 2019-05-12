package hu.adatb.view.Dialogs.HallgatoTabla;

import hu.adatb.dao.Adatbazis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class HallgatoLekerdezesDialog extends JDialog implements ActionListener {
    private JPanel panel_inputPanel;
    private JPanel panel_lekerdezPanel;
    private JButton button_lekerdezHallgato;
    private JTextArea tf_lekerdez;

    private Adatbazis adatbazis;

    public HallgatoLekerdezesDialog(Frame szuloAblak){
        super(szuloAblak, "Adatok listázása");

        this.button_lekerdezHallgato = new JButton("Lekerdez");
        this.tf_lekerdez = new JTextArea();

        this.panel_lekerdezPanel = new JPanel();
        this.panel_lekerdezPanel.setLayout(new BorderLayout());
        this.panel_inputPanel = new JPanel();
        this.panel_inputPanel.setLayout(new GridLayout(1, 1));

        this.getContentPane().add(panel_lekerdezPanel);

        this.panel_inputPanel.add(this.tf_lekerdez, BorderLayout.CENTER);
        this.tf_lekerdez.setVisible(false);

        this.panel_lekerdezPanel.add(panel_inputPanel, BorderLayout.CENTER);
        this.panel_lekerdezPanel.add(button_lekerdezHallgato, BorderLayout.SOUTH);


        this.button_lekerdezHallgato.addActionListener(this);

        this.setSize(600,400);

        this.pack();

    }

    public void elokeszit(){
        this.tf_lekerdez.setText("");

    }

    public void setAdatbazis(Adatbazis adatbazis){
        this.adatbazis = adatbazis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Adatbazis adatbazis = new Adatbazis();
        adatbazis.connectToDatabase();
        if(e.getSource().equals(this.button_lekerdezHallgato)){
            tf_lekerdez.setVisible(true);
            List<String> tabla = adatbazis.listAll("b_hallgato");
            tf_lekerdez.setText(String.valueOf(tabla));

        }

        this.dispose();
    }
}