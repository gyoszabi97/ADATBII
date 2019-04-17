package hu.adatb.view;
import hu.adatb.dao.Adatbazis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class InformatikusFrame extends JFrame implements ActionListener {
    private JMenu Menu_szobak;
    private JMenu Menu_hallgatok;
    private JMenu Menu_informatikus;
    private JMenu Menu_lekerdezesek;
    private JMenuItem menuItem_lekerdezesek;
    private JMenuItem menuItem_statisztikak;
    private JMenuItem menuItem_uj_hallgato;
    private JMenuItem menuItem_hallgato_adatok;

    private UjHallgatoDialog dialog_ujHallgatoDialog;
    private HallgatoAdataiDialog dialog_hallgatoAdataiDialog;

    private Adatbazis adatbazis;

    public InformatikusFrame(String title){
        super(title);

        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);

        this.Menu_hallgatok = new JMenu("Hallgatok");
        this.Menu_szobak = new JMenu("szobak");
        this.Menu_informatikus = new JMenu("Játék");
        this.Menu_lekerdezesek = new JMenu("Lekérdezések és statisztikák");

        this.menuItem_lekerdezesek = new JMenuItem("Lekérdezések");
        this.menuItem_statisztikak = new JMenuItem("Statisztikák");
        this.menuItem_hallgato_adatok = new JMenuItem("Hallgató adatai");
        this.menuItem_uj_hallgato = new JMenuItem("Új hallgató");

        menubar.add(Menu_hallgatok);
        menubar.add(Menu_szobak);
        menubar.add(Menu_informatikus);
        menubar.add(Menu_lekerdezesek);


        this.Menu_lekerdezesek.add(menuItem_lekerdezesek);
        this.Menu_lekerdezesek.add(menuItem_statisztikak);
        this.Menu_hallgatok.add(menuItem_hallgato_adatok);
        this.Menu_hallgatok.add(menuItem_uj_hallgato);

        this.dialog_ujHallgatoDialog = new UjHallgatoDialog(this);
        this.dialog_ujHallgatoDialog.setVisible(false);
        this.dialog_hallgatoAdataiDialog = new HallgatoAdataiDialog(this);
        this.dialog_hallgatoAdataiDialog.setVisible(false);

        this.adatbazis = new Adatbazis();
        adatbazis.connectToDatabase();


        this.menuItem_lekerdezesek.addActionListener(this);
        this.menuItem_statisztikak.addActionListener(this);
        this.menuItem_uj_hallgato.addActionListener(this);
        this.menuItem_hallgato_adatok.addActionListener(this);

        this.setSize(600,400);
        this.setLocation(300, 300);
        this.setVisible(true);
    }


    
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource().equals(menuItem_lekerdezesek)){

        }
        if(actionEvent.getSource().equals(menuItem_statisztikak)){

        }
        if(actionEvent.getSource().equals(menuItem_uj_hallgato)){
            this.dialog_ujHallgatoDialog.elokeszit();
            this.dialog_ujHallgatoDialog.setVisible(true);
        	
        	
        }
        if(actionEvent.getSource().equals(menuItem_hallgato_adatok)){
            this.dialog_hallgatoAdataiDialog.elokeszit();
            this.dialog_hallgatoAdataiDialog.setVisible(true);

        }
    }
}
