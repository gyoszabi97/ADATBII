package hu.adatb.view;

import hu.adatb.dao.Adatbazis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HallgatoAdataiDialog extends JDialog implements ActionListener {
    private JTextField tf_nickname;
    private JTextArea tf_lekerdez;
    private JPanel panel_lekerdez;
    private JPanel panel_inputPanel;
    private JButton button_lekerdez;

    private Adatbazis adatbazis;

   public HallgatoAdataiDialog(Frame szuloAblak){
       super(szuloAblak, "Adatok listázása");

       this.tf_nickname = new JTextField();

       this.tf_lekerdez = new JTextArea();
       this.button_lekerdez = new JButton("Listázás");

       this.panel_lekerdez = new JPanel();
       this.panel_lekerdez.setLayout(new BorderLayout());
       this.panel_inputPanel = new JPanel();
       this.panel_inputPanel.setLayout(new GridLayout(1, 2));

       this.panel_lekerdez.add(tf_lekerdez, BorderLayout.CENTER);
       this.panel_lekerdez.add(button_lekerdez, BorderLayout.SOUTH);

       this.panel_inputPanel.add(new JLabel("Nickname"));
       this.panel_inputPanel.add(this.tf_nickname);

       this.panel_lekerdez.add(panel_inputPanel, BorderLayout.CENTER);

       this.button_lekerdez.addActionListener(this);
       this.getContentPane().add(panel_lekerdez);

       this.pack();
       this.setSize(200, 200);

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
       if(e.getSource().equals(this.button_lekerdez)){
           String nickname = this.tf_nickname.getText();

           String eredmeny = adatbazis.hallgatotLekerdez();
           tf_lekerdez.setText(eredmeny);
       }
         //String eredmeny = adatbazis.hallgatotLekerdez();
        //tf_lekerdez.setText(eredmeny);

        this.dispose();
    }
}
