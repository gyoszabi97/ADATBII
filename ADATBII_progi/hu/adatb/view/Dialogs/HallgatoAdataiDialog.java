package hu.adatb.view.Dialogs;

import hu.adatb.dao.Adatbazis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HallgatoAdataiDialog extends JDialog implements ActionListener {
    private JTextField tf_nickname;
    private JPanel panel_inputPanel;
    private JPanel panel_lekerdezPanel;
    private JButton button_lekerdez;
    private JTextArea tf_lekerdez;

    private Adatbazis adatbazis;

   public HallgatoAdataiDialog(Frame szuloAblak){
       super(szuloAblak, "Adatok listázása");

       this.tf_nickname = new JTextField();
       this.button_lekerdez = new JButton("Lekerdez");
       this.tf_lekerdez = new JTextArea();

       this.panel_lekerdezPanel = new JPanel();
       this.panel_lekerdezPanel.setLayout(new BorderLayout());
       this.panel_inputPanel = new JPanel();
       this.panel_inputPanel.setLayout(new GridLayout(1, 1));

       this.getContentPane().add(panel_lekerdezPanel);

       this.panel_inputPanel.add(new JLabel("Nickname"));
       this.panel_inputPanel.add(this.tf_nickname);
       this.tf_nickname.setVisible(true);
       this.panel_inputPanel.add(this.tf_lekerdez, BorderLayout.CENTER);
       this.tf_lekerdez.setVisible(false);


       this.panel_lekerdezPanel.add(panel_inputPanel, BorderLayout.CENTER);
       this.panel_lekerdezPanel.add(button_lekerdez, BorderLayout.SOUTH);


       this.button_lekerdez.addActionListener(this);

       this.setSize(600,400);

       this.pack();

   }

   public void elokeszit(){
       this.tf_nickname.setText("");
       this.tf_lekerdez.setText("");

   }

   public void setAdatbazis(Adatbazis adatbazis){
       this.adatbazis = adatbazis;
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       Adatbazis adatbazis = new Adatbazis();
       adatbazis.connectToDatabase();
       if(e.getSource().equals(this.button_lekerdez)){
           tf_nickname.setVisible(false);
           tf_lekerdez.setVisible(true);

           String nickname = this.tf_nickname.getText();

           String eredmeny = adatbazis.hallgatotLekerdez(nickname);
           tf_lekerdez.setText(eredmeny);

       }

        this.dispose();
    }
}
