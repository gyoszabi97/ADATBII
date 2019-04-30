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
    private JMenu Menu_tablak;
    private JMenuItem menuItem_lekerdezesek;
    private JMenuItem menuItem_statisztikak;
    private JMenuItem menuItem_uj_hallgato;
    private JMenuItem menuItem_hallgato_adatok;
    private JMenuItem menuItem_tablaHelyesValaszok;
    private JMenuItem menuItem_tablaLehetsegesValaszok;
    private JMenuItem menuItem_tablaSugo;
    private JMenuItem menuItem_tablaPuska;
    private JMenuItem menuItem_tablaKerdesek;
    private JMenuItem menuItem_tablaKreditNyeremeny;
    private JMenuItem menuItem_tablaHallgato;
    private JMenuItem menuItem_tablaSzoba;
    private JMenuItem menuItem_tablaTantargyak;


    private UjHallgatoDialog dialog_ujHallgatoDialog;
    private HallgatoAdataiDialog dialog_hallgatoAdataiDialog;
    private TablakDialog dialog_tablakDialog;

    private Adatbazis adatbazis;

    public InformatikusFrame(String title){
        super(title);

        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);

        this.Menu_hallgatok = new JMenu("Hallgatok");
        this.Menu_szobak = new JMenu("Szobák");
        this.Menu_informatikus = new JMenu("Játék");
        this.Menu_lekerdezesek = new JMenu("Lekérdezések és statisztikák");
        this.Menu_tablak = new JMenu("Táblák");

        this.menuItem_lekerdezesek = new JMenuItem("Lekérdezések");
        this.menuItem_statisztikak = new JMenuItem("Statisztikák");
        this.menuItem_uj_hallgato = new JMenuItem("Új hallgató");
        this.menuItem_hallgato_adatok = new JMenuItem("Hallgató adatai");
        this.menuItem_tablaHallgato = new JMenuItem("Hallgató tábla");
        this.menuItem_tablaSzoba = new JMenuItem("Szoba tábla");
        this.menuItem_tablaKerdesek = new JMenuItem("Kérdések tábla");
        this.menuItem_tablaLehetsegesValaszok = new JMenuItem("LehetsegesValaszok tábla");
        this.menuItem_tablaHelyesValaszok = new JMenuItem("HelyesVálaszok tábla");
        this.menuItem_tablaKreditNyeremeny = new JMenuItem("KreditNyeremény tábla");
        this.menuItem_tablaPuska = new JMenuItem("Puska tábla");
        this.menuItem_tablaTantargyak = new JMenuItem("Tantárgyak tábla");
        this.menuItem_tablaSugo = new JMenuItem("Sugo tábla");


        menubar.add(Menu_hallgatok);
        menubar.add(Menu_szobak);
        menubar.add(Menu_informatikus);
        menubar.add(Menu_lekerdezesek);
        menubar.add(Menu_tablak);


        this.Menu_lekerdezesek.add(menuItem_lekerdezesek);
        this.Menu_lekerdezesek.add(menuItem_statisztikak);
        this.Menu_hallgatok.add(menuItem_uj_hallgato);
        this.Menu_hallgatok.add(menuItem_hallgato_adatok);
        this.Menu_tablak.add(menuItem_tablaHallgato);
        this.Menu_tablak.add(menuItem_tablaSzoba);
        this.Menu_tablak.add(menuItem_tablaTantargyak);
        this.Menu_tablak.add(menuItem_tablaKerdesek);
        this.Menu_tablak.add(menuItem_tablaLehetsegesValaszok);
        this.Menu_tablak.add(menuItem_tablaHelyesValaszok);
        this.Menu_tablak.add(menuItem_tablaKreditNyeremeny);
        this.Menu_tablak.add(menuItem_tablaSugo);
        this.Menu_tablak.add(menuItem_tablaPuska);



        this.dialog_ujHallgatoDialog = new UjHallgatoDialog(this);
        this.dialog_ujHallgatoDialog.setVisible(false);
        this.dialog_hallgatoAdataiDialog = new HallgatoAdataiDialog(this);
        this.dialog_hallgatoAdataiDialog.setVisible(false);
        this.dialog_tablakDialog = new TablakDialog(this);
        this.dialog_tablakDialog.setVisible(false);

        this.adatbazis = new Adatbazis();
        adatbazis.connectToDatabase();


        this.menuItem_lekerdezesek.addActionListener(this);
        this.menuItem_statisztikak.addActionListener(this);
        this.menuItem_uj_hallgato.addActionListener(this);
        this.menuItem_hallgato_adatok.addActionListener(this);
        this.menuItem_tablaHallgato.addActionListener(this);
        this.menuItem_tablaSzoba.addActionListener(this);
        this.menuItem_tablaTantargyak.addActionListener(this);
        this.menuItem_tablaKerdesek.addActionListener(this);
        this.menuItem_tablaLehetsegesValaszok.addActionListener(this);
        this.menuItem_tablaHelyesValaszok.addActionListener(this);
        this.menuItem_tablaKreditNyeremeny.addActionListener(this);
        this.menuItem_tablaSugo.addActionListener(this);
        this.menuItem_tablaPuska.addActionListener(this);


        this.setSize(600,400);
        this.setLocation(300, 300);
        this.setVisible(true);
    }


    
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(menuItem_tablaHallgato)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSzoba)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaTantargyak)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKerdesek)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaLehetsegesValaszok)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaHelyesValaszok)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKreditNyeremeny)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaPuska)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSugo)){
            this.dialog_tablakDialog.elokeszit();
            this.dialog_tablakDialog.setVisible(true);
        }
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
