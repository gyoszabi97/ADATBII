package hu.adatb.view.Dialogs;
import javax.swing.*;

import hu.adatb.dao.Adatbazis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UjHallgatoDialog extends JDialog implements ActionListener {
    private JTextField tf_nickname;
    private JTextField tf_szoba;

    private JPanel panel_Panel;
    private JPanel panel_inputPanel;
    private JButton button_felviszGomb;

    public UjHallgatoDialog(Frame szuloAblak) {
        super(szuloAblak, "Új hallgató felvétele");

        //GUI objektumok létrehozása

        this.tf_nickname = new JTextField();
        this.tf_szoba = new JTextField();
        this.button_felviszGomb = new JButton("Felvisz");

        //panelek és elrendezéseik létrehozása
        this.panel_Panel = new JPanel();
        this.panel_Panel.setLayout(new BorderLayout());
        this.panel_inputPanel = new JPanel();
        this.panel_inputPanel.setLayout(new GridLayout(2, 2));

        //Főpanel dialogablakhoz adása
        this.getContentPane().add(panel_Panel);

        //input mezők
        this.panel_inputPanel.add(new JLabel("Nickname"));
        this.panel_inputPanel.add(this.tf_nickname);
        this.panel_inputPanel.add(new JLabel("Szoba"));
        this.panel_inputPanel.add(this.tf_szoba);

        //inputpanel a főpanelhez adása, középre

        this.panel_Panel.add(panel_inputPanel, BorderLayout.CENTER);

        //felviszgomb főpanel aljához adása

        this.panel_Panel.add(button_felviszGomb, BorderLayout.SOUTH);

        //Felvisz gomb eseményfigyelője
        this.button_felviszGomb.addActionListener(this);

        this.pack();

    }
        public void elokeszit(){

        this.tf_nickname.setText("");
        this.tf_szoba.setText("");
        }



    
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(this.button_felviszGomb)){
            String nickname = this.tf_nickname.getText();
            String szoba = this.tf_szoba.getText();

           /* Adatbazis db = new Adatbazis();
            db.connectToDatabase();
            db.hallgatotLekerdez(nickname); */

          /* boolean sikerult = this.adatbazis.UjHallgato(nickname, szoba); */

            this.dispose();
        }
    }
}
