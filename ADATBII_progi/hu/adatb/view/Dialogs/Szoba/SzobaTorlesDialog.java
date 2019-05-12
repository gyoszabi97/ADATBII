package hu.adatb.view.Dialogs.Szoba;

import hu.adatb.dao.Adatbazis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class SzobaTorlesDialog extends JDialog implements ActionListener {
    private JPanel panel_inputPanel;
    private JPanel panel_torlesPanel;
    private JButton button_torolSzoba;
    private JTextField tf_szobaname;

    private Adatbazis adatbazis;

    public SzobaTorlesDialog (Frame szuloAblak){
        super(szuloAblak, "Adatok torlese");

        this.button_torolSzoba = new JButton("Torles");
        this.tf_szobaname = new JTextField();

        this.panel_torlesPanel = new JPanel();
        this.panel_torlesPanel.setLayout(new BorderLayout());
        this.panel_inputPanel = new JPanel();
        this.panel_inputPanel.setLayout(new GridLayout(1, 1));



        //panelek és elrendezéseik létrehozása
        this.panel_torlesPanel = new JPanel();
        this.panel_torlesPanel.setLayout(new BorderLayout());
        this.panel_inputPanel = new JPanel();
        this.panel_inputPanel.setLayout(new GridLayout(2, 2));

        //Főpanel dialogablakhoz adása
        this.getContentPane().add(panel_torlesPanel);

        //input mezők
        this.panel_inputPanel.add(new JLabel("szobanév"));
        this.panel_inputPanel.add(this.tf_szobaname);

        //inputpanel a főpanelhez adása, középre

        this.panel_torlesPanel.add(panel_inputPanel, BorderLayout.CENTER);

        //felviszgomb főpanel aljához adása

        this.panel_torlesPanel.add(button_torolSzoba, BorderLayout.SOUTH);

        //Felvisz gomb eseményfigyelője
        this.button_torolSzoba.addActionListener(this);

        this.pack();


        this.panel_torlesPanel.add(panel_inputPanel, BorderLayout.CENTER);
        this.panel_torlesPanel.add(button_torolSzoba, BorderLayout.SOUTH);


        this.button_torolSzoba.addActionListener(this);

        this.setSize(600,400);

        this.pack();

    }

    public void elokeszit(){
        this.tf_szobaname.setText("");

    }

    public void setAdatbazis(Adatbazis adatbazis){
        this.adatbazis = adatbazis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Adatbazis adatbazis = new Adatbazis();
        adatbazis.connectToDatabase();
        if(e.getSource().equals(this.button_torolSzoba)){
            try {
                List<String> tabla = (List<String>) adatbazis.deleteByName("b_szoba", this.tf_szobaname);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }

        this.dispose();
    }
}
