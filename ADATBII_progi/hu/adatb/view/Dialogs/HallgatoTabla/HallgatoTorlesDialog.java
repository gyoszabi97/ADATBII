package hu.adatb.view.Dialogs.HallgatoTabla;

import hu.adatb.dao.Adatbazis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class HallgatoTorlesDialog extends JDialog implements ActionListener {
    private JPanel panel_inputPanel;
    private JPanel panel_torlesPanel;
    private JButton button_torolHallgato;
    private JTextField tf_nickname;

    private Adatbazis adatbazis;

    public HallgatoTorlesDialog(Frame szuloAblak){
        super(szuloAblak, "Adatok torlese");

        this.button_torolHallgato = new JButton("Torles");
        this.tf_nickname = new JTextField();

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
        this.panel_inputPanel.add(new JLabel("Nickname"));
        this.panel_inputPanel.add(this.tf_nickname);

        //inputpanel a főpanelhez adása, középre

        this.panel_torlesPanel.add(panel_inputPanel, BorderLayout.CENTER);

        //felviszgomb főpanel aljához adása

        this.panel_torlesPanel.add(button_torolHallgato, BorderLayout.SOUTH);

        //Felvisz gomb eseményfigyelője
        this.button_torolHallgato.addActionListener(this);

        this.pack();


        this.panel_torlesPanel.add(panel_inputPanel, BorderLayout.CENTER);
        this.panel_torlesPanel.add(button_torolHallgato, BorderLayout.SOUTH);


        this.button_torolHallgato.addActionListener(this);

        this.setSize(600,400);

        this.pack();

    }

    public void elokeszit(){
        this.tf_nickname.setText("");

    }

    public void setAdatbazis(Adatbazis adatbazis){
        this.adatbazis = adatbazis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Adatbazis adatbazis = new Adatbazis();
        adatbazis.connectToDatabase();
        if(e.getSource().equals(this.button_torolHallgato)){
            try {
                List<String> tabla = (List<String>) adatbazis.deleteByName("b_hallgato", this.tf_nickname);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }

        this.dispose();
    }
}
