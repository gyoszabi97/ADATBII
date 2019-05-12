package hu.adatb.view;
import hu.adatb.dao.Adatbazis;
import hu.adatb.view.Dialogs.HallgatoAdataiDialog;
import hu.adatb.view.Dialogs.HallgatoTabla.HallgatoLekerdezesDialog;
import hu.adatb.view.Dialogs.HallgatoTabla.HallgatoTorlesDialog;
import hu.adatb.view.Dialogs.HallgatoTabla.HallgatoUjDialog;
import hu.adatb.view.Dialogs.HelyesValaszok.HelyesValaszokLekerdezDialog;
import hu.adatb.view.Dialogs.HelyesValaszok.HelyesValaszokModositasDialog;
import hu.adatb.view.Dialogs.Kerdesek.KerdesekLekerdezesDialog;
import hu.adatb.view.Dialogs.Kerdesek.KerdesekModositasDialog;
import hu.adatb.view.Dialogs.Kerdesek.KerdesekTorlesDialog;
import hu.adatb.view.Dialogs.Kerdesek.KerdesekUjDialog;
import hu.adatb.view.Dialogs.KreditNyeremeny.KreditNyeremenyLekerdezesDialog;
import hu.adatb.view.Dialogs.KreditNyeremeny.KreditNyeremenyModositasDialog;
import hu.adatb.view.Dialogs.LehetsegesValaszok.LehetsegesValaszokLekerdezesDialog;
import hu.adatb.view.Dialogs.LehetsegesValaszok.LehetsegesValaszokModositasDialog;
import hu.adatb.view.Dialogs.Puska.PuskaLekerdezesDialog;
import hu.adatb.view.Dialogs.Puska.PuskaModositasDialog;
import hu.adatb.view.Dialogs.Sugo.SugoLekerdezesDialog;
import hu.adatb.view.Dialogs.Sugo.SugoModositasDialog;
import hu.adatb.view.Dialogs.Szoba.SzobaLekerdezesDialog;
import hu.adatb.view.Dialogs.Szoba.SzobaModositasDialog;
import hu.adatb.view.Dialogs.Szoba.SzobaTorlesDialog;
import hu.adatb.view.Dialogs.Szoba.SzobaUjDialog;
import hu.adatb.view.Dialogs.Tantargyak.TantargyakLekerdezesDialog;
import hu.adatb.view.Dialogs.Tantargyak.TantargyakModositasDialog;
import hu.adatb.view.Dialogs.Tantargyak.TantargyakTorlesDialog;
import hu.adatb.view.Dialogs.Tantargyak.TantargyakUjDialog;
import hu.adatb.view.Dialogs.UjHallgatoDialog;

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
    private JMenu Menu_tablakListazas;
    private JMenu Menu_tablakUj;
    private JMenu Menu_tablakModositas;
    private JMenu Menu_tablakTorles;
    private JMenuItem menuItem_lekerdezesek;
    private JMenuItem menuItem_statisztikak;
    private JMenuItem menuItem_uj_hallgato;
    private JMenuItem menuItem_hallgato_adatok;
    private JMenuItem menuItem_tablaLehetsegesValaszokModositas;
    private JMenuItem menuItem_tablaLehetsegesValaszokLekerdezes;
    private JMenuItem menuItem_tablaSugoModositas;
    private JMenuItem menuItem_tablaSugoLekerdezes;
    private JMenuItem menuItem_tablaPuskaModositas;
    private JMenuItem menuItem_tablaPuskaLekerdezes;
    private JMenuItem menuItem_tablaKerdesekUj;
    private JMenuItem menuItem_tablaKerdesekModositas;
    private JMenuItem menuItem_tablaKerdesekTorles;
    private JMenuItem menuItem_tablaKerdesekLekerdezes;
    private JMenuItem menuItem_tablaKreditNyeremenyModositas;
    private JMenuItem menuItem_tablaKreditNyeremenyLekerdezes;
    private JMenuItem menuItem_tablaHallgatoUj;
    private JMenuItem menuItem_tablaHallgatoTorles;
    private JMenuItem menuItem_tablaHallgatoModositas;
    private JMenuItem menuItem_tablaHallgatoLekerdezes;
    private JMenuItem menuItem_tablaSzobaUj;
    private JMenuItem menuItem_tablaSzobaModositas;
    private JMenuItem menuItem_tablaSzobaTorles;
    private JMenuItem menuItem_tablaSzobaLekerdezes;
    private JMenuItem menuItem_tablaTantargyakUj;
    private JMenuItem menuItem_tablaTantargyakTorles;
    private JMenuItem menuItem_tablaTantargyakModositas;
    private JMenuItem menuItem_tablaTantargyakLekerdezes;
    private JMenuItem menuItem_tablaHelyesValaszokModositas;
    private JMenuItem menuItem_tablaHelyesValaszokLekerdezes;


    private UjHallgatoDialog dialog_ujHallgatoDialog;
    private HallgatoAdataiDialog dialog_hallgatoAdataiDialog;
    private HallgatoLekerdezesDialog dialog_hallgatoLekerdezesDialog;
    private HallgatoTorlesDialog dialog_hallgatoTorlesDialog;
    private HallgatoUjDialog dialog_hallgatoUjDialog;
    private HelyesValaszokLekerdezDialog dialog_helyesValaszokLekerdezesDialog;
    private HelyesValaszokModositasDialog dialog_helyesValaszokModositasDialog;
    private KerdesekLekerdezesDialog dialog_kerdesekLekerdezesDialog;
    private KerdesekModositasDialog dialog_kerdesekModositasDialog;
    private KerdesekTorlesDialog dialog_kerdesekTorlesDialog;
    private KerdesekUjDialog dialog_kerdesekUjDialog;
    private KreditNyeremenyLekerdezesDialog dialog_kreditNyeremenyLekerdezesDialog;
    private KreditNyeremenyModositasDialog dialog_kreditNyeremenyModositasDialog;
    private LehetsegesValaszokLekerdezesDialog dialog_lehetsegesValaszokLekerdezesDialog;
    private LehetsegesValaszokModositasDialog dialog_lehetsegesValaszokModositasDialog;
    private PuskaLekerdezesDialog dialog_puskaLekerdezesDialog;
    private PuskaModositasDialog dialog_puskaModositasDialog;
    private SugoLekerdezesDialog dialog_sugoLekerdezesDialog;
    private SugoModositasDialog dialog_sugoModositasDialog;
    private SzobaLekerdezesDialog dialog_szobaLekerdezesDialog;
    private SzobaModositasDialog dialog_szobaModositasDialog;
    private SzobaTorlesDialog dialog_szobaTorlesDialog;
    private SzobaUjDialog dialog_szobaUjDialog;
    private TantargyakLekerdezesDialog dialog_tantargyakLekerdezesDialog;
    private TantargyakModositasDialog dialog_tantargyakModositasDialog;
    private TantargyakTorlesDialog dialog_tantargyakTorlesDialog;
    private TantargyakUjDialog dialog_tantargyakUjDialog;

    private Adatbazis adatbazis;

    public InformatikusFrame(String title){
        super(title);

        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);

        this.Menu_hallgatok = new JMenu("Hallgatok");
        this.Menu_szobak = new JMenu("Szobák");
        this.Menu_informatikus = new JMenu("Játék");
        this.Menu_lekerdezesek = new JMenu("Lekérdezések és statisztikák");
        this.Menu_tablakListazas = new JMenu("Táblák listázása");
        this.Menu_tablakModositas = new JMenu("Táblák módosítása");
        this.Menu_tablakTorles = new JMenu("Táblák rekordjainak törlése");
        this.Menu_tablakUj = new JMenu("Táblákhoz új rekord felvitele");

        this.menuItem_lekerdezesek = new JMenuItem("Lekérdezések");
        this.menuItem_statisztikak = new JMenuItem("Statisztikák");
        this.menuItem_uj_hallgato = new JMenuItem("Új hallgató");
        this.menuItem_hallgato_adatok = new JMenuItem("Hallgató adatai");
        this.menuItem_tablaHallgatoLekerdezes = new JMenuItem("Hallgató tábla lekérdezése");
        this.menuItem_tablaHallgatoTorles = new JMenuItem("Hallgató tábla rekordjainak törlése");
        this.menuItem_tablaHallgatoUj = new JMenuItem("Hallgató táblá új rekord felvétele");
        this.menuItem_tablaSzobaUj = new JMenuItem("Szoba tábla - uj");
        this.menuItem_tablaSzobaLekerdezes = new JMenuItem("Szoba tábla - lekerdezes");
        this.menuItem_tablaSzobaModositas = new JMenuItem("Szoba tábla - torles");
        this.menuItem_tablaSzobaTorles = new JMenuItem("Szoba tábla - modositas");
        this.menuItem_tablaKerdesekUj = new JMenuItem("Kérdések tábla - uj");
        this.menuItem_tablaKerdesekTorles = new JMenuItem("Kérdések tábla - torles");
        this.menuItem_tablaKerdesekLekerdezes = new JMenuItem("Kérdések tábla - lekerdezes");
        this.menuItem_tablaKerdesekModositas = new JMenuItem("Kérdések tábla - modositas");
        this.menuItem_tablaLehetsegesValaszokModositas = new JMenuItem("LehetsegesValaszok tábla - modositas");
        this.menuItem_tablaLehetsegesValaszokLekerdezes = new JMenuItem("LehetsegesValaszok tábla - lekerdezes");
        this.menuItem_tablaHelyesValaszokModositas = new JMenuItem("HelyesVálaszok tábla - modositas");
        this.menuItem_tablaHelyesValaszokLekerdezes = new JMenuItem("HelyesVálaszok tábla - lekerdezes");
        this.menuItem_tablaKreditNyeremenyModositas = new JMenuItem("KreditNyeremény tábla - modositas");
        this.menuItem_tablaKreditNyeremenyLekerdezes = new JMenuItem("KreditNyeremény tábla - lekerdezes");
        this.menuItem_tablaPuskaModositas = new JMenuItem("Puska tábla - modositas");
        this.menuItem_tablaPuskaLekerdezes = new JMenuItem("Puska tábla - lekerdezes");
        this.menuItem_tablaTantargyakUj = new JMenuItem("Tantárgyak tábla - uj");
        this.menuItem_tablaTantargyakTorles = new JMenuItem("Tantárgyak tábla - torles");
        this.menuItem_tablaTantargyakModositas = new JMenuItem("Tantárgyak tábla - modositas");
        this.menuItem_tablaTantargyakLekerdezes = new JMenuItem("Tantárgyak tábla lekerdezes");
        this.menuItem_tablaSugoModositas = new JMenuItem("Sugo tábla - modositas");
        this.menuItem_tablaSugoLekerdezes = new JMenuItem("Sugo tábla - lekerdezes");


        menubar.add(Menu_hallgatok);
        menubar.add(Menu_szobak);
        menubar.add(Menu_informatikus);
        menubar.add(Menu_lekerdezesek);
        menubar.add(Menu_tablakUj);
        menubar.add(Menu_tablakModositas);
        menubar.add(Menu_tablakTorles);
        menubar.add(Menu_tablakListazas);


        this.Menu_lekerdezesek.add(menuItem_lekerdezesek);
        this.Menu_lekerdezesek.add(menuItem_statisztikak);
        this.Menu_hallgatok.add(menuItem_uj_hallgato);
        this.Menu_hallgatok.add(menuItem_hallgato_adatok);
        this.Menu_tablakUj.add(menuItem_tablaHallgatoUj);
        this.Menu_tablakListazas.add(menuItem_tablaHallgatoLekerdezes);
        this.Menu_tablakTorles.add(menuItem_tablaHallgatoTorles);
        this.Menu_tablakUj.add(menuItem_tablaSzobaUj);
        this.Menu_tablakListazas.add(menuItem_tablaSzobaLekerdezes);
        this.Menu_tablakTorles.add(menuItem_tablaSzobaTorles);
        this.Menu_tablakModositas.add(menuItem_tablaSzobaModositas);
        this.Menu_tablakUj.add(menuItem_tablaTantargyakUj);
        this.Menu_tablakListazas.add(menuItem_tablaTantargyakLekerdezes);
        this.Menu_tablakTorles.add(menuItem_tablaTantargyakTorles);
        this.Menu_tablakModositas.add(menuItem_tablaTantargyakModositas);
        this.Menu_tablakUj.add(menuItem_tablaKerdesekUj);
        this.Menu_tablakListazas.add(menuItem_tablaKerdesekLekerdezes);
        this.Menu_tablakTorles.add(menuItem_tablaKerdesekTorles);
        this.Menu_tablakModositas.add(menuItem_tablaKerdesekModositas);
        this.Menu_tablakListazas.add(menuItem_tablaLehetsegesValaszokLekerdezes);
        this.Menu_tablakModositas.add(menuItem_tablaLehetsegesValaszokModositas);
        this.Menu_tablakModositas.add(menuItem_tablaHelyesValaszokModositas);
        this.Menu_tablakListazas.add(menuItem_tablaHelyesValaszokLekerdezes);
        this.Menu_tablakModositas.add(menuItem_tablaKreditNyeremenyModositas);
        this.Menu_tablakListazas.add(menuItem_tablaKreditNyeremenyLekerdezes);
        this.Menu_tablakModositas.add(menuItem_tablaSugoModositas);
        this.Menu_tablakListazas.add(menuItem_tablaSugoLekerdezes);
        this.Menu_tablakModositas.add(menuItem_tablaPuskaModositas);
        this.Menu_tablakListazas.add(menuItem_tablaPuskaLekerdezes);



        this.dialog_ujHallgatoDialog = new UjHallgatoDialog(this);
        this.dialog_ujHallgatoDialog.setVisible(false);
        this.dialog_hallgatoAdataiDialog = new HallgatoAdataiDialog(this);
        this.dialog_hallgatoAdataiDialog.setVisible(false);
        this.dialog_hallgatoLekerdezesDialog = new HallgatoLekerdezesDialog(this);
        this.dialog_hallgatoLekerdezesDialog.setVisible(false);
        this.dialog_hallgatoTorlesDialog = new HallgatoTorlesDialog(this);
        this.dialog_hallgatoTorlesDialog.setVisible(false);
        this.dialog_hallgatoUjDialog = new HallgatoUjDialog(this);
        this.dialog_hallgatoUjDialog.setVisible(false);
        this.dialog_helyesValaszokLekerdezesDialog = new HelyesValaszokLekerdezDialog(this);
        this.dialog_helyesValaszokLekerdezesDialog.setVisible(false);
        this.dialog_helyesValaszokModositasDialog = new HelyesValaszokModositasDialog(this);
        this.dialog_helyesValaszokModositasDialog.setVisible(false);
        this.dialog_kerdesekLekerdezesDialog = new KerdesekLekerdezesDialog(this);
        this.dialog_kerdesekLekerdezesDialog.setVisible(false);
        this.dialog_kerdesekModositasDialog = new KerdesekModositasDialog(this);
        this.dialog_kerdesekModositasDialog.setVisible(false);
        this.dialog_kerdesekTorlesDialog = new KerdesekTorlesDialog(this);
        this.dialog_kerdesekTorlesDialog.setVisible(false);
        this.dialog_kerdesekUjDialog = new KerdesekUjDialog(this);
        this.dialog_kerdesekUjDialog.setVisible(false);
        this.dialog_kreditNyeremenyLekerdezesDialog = new KreditNyeremenyLekerdezesDialog(this);
        this.dialog_kreditNyeremenyLekerdezesDialog.setVisible(false);
        this.dialog_kreditNyeremenyModositasDialog = new KreditNyeremenyModositasDialog(this);
        this.dialog_kreditNyeremenyModositasDialog.setVisible(false);
        this.dialog_lehetsegesValaszokLekerdezesDialog = new LehetsegesValaszokLekerdezesDialog(this);
        this.dialog_lehetsegesValaszokLekerdezesDialog.setVisible(false);
        this.dialog_lehetsegesValaszokModositasDialog = new LehetsegesValaszokModositasDialog(this);
        this.dialog_lehetsegesValaszokModositasDialog.setVisible(false);
        this.dialog_puskaLekerdezesDialog = new PuskaLekerdezesDialog(this);
        this.dialog_puskaLekerdezesDialog.setVisible(false);
        this.dialog_puskaModositasDialog = new PuskaModositasDialog(this);
        this.dialog_puskaModositasDialog.setVisible(false);
        this.dialog_sugoLekerdezesDialog = new SugoLekerdezesDialog(this);
        this.dialog_sugoLekerdezesDialog.setVisible(false);
        this.dialog_sugoModositasDialog = new SugoModositasDialog(this);
        this.dialog_puskaModositasDialog.setVisible(false);
        this.dialog_szobaLekerdezesDialog = new SzobaLekerdezesDialog(this);
        this.dialog_szobaLekerdezesDialog.setVisible(false);
        this.dialog_szobaModositasDialog = new SzobaModositasDialog(this);
        this.dialog_szobaModositasDialog.setVisible(false);
        this.dialog_szobaTorlesDialog = new SzobaTorlesDialog(this);
        this.dialog_szobaTorlesDialog.setVisible(false);
        this.dialog_szobaUjDialog = new SzobaUjDialog(this);
        this.dialog_szobaUjDialog.setVisible(false);
        this.dialog_tantargyakLekerdezesDialog = new TantargyakLekerdezesDialog(this);
        this.dialog_tantargyakLekerdezesDialog.setVisible(false);
        this.dialog_tantargyakModositasDialog = new TantargyakModositasDialog(this);
        this.dialog_tantargyakModositasDialog.setVisible(false);
        this.dialog_tantargyakTorlesDialog = new TantargyakTorlesDialog(this);
        this.dialog_tantargyakTorlesDialog.setVisible(false);
        this.dialog_tantargyakUjDialog = new TantargyakUjDialog(this);
        this.dialog_tantargyakUjDialog.setVisible(false);

        this.adatbazis = new Adatbazis();
        adatbazis.connectToDatabase();


        this.menuItem_lekerdezesek.addActionListener(this);
        this.menuItem_statisztikak.addActionListener(this);
        this.menuItem_uj_hallgato.addActionListener(this);
        this.menuItem_hallgato_adatok.addActionListener(this);
        this.menuItem_tablaHallgatoUj.addActionListener(this);
        this.menuItem_tablaHallgatoTorles.addActionListener(this);
        this.menuItem_tablaHallgatoLekerdezes.addActionListener(this);
        this.menuItem_tablaSzobaUj.addActionListener(this);
        this.menuItem_tablaSzobaModositas.addActionListener(this);
        this.menuItem_tablaSzobaTorles.addActionListener(this);
        this.menuItem_tablaSzobaLekerdezes.addActionListener(this);
        this.menuItem_tablaTantargyakUj.addActionListener(this);
        this.menuItem_tablaTantargyakModositas.addActionListener(this);
        this.menuItem_tablaTantargyakTorles.addActionListener(this);
        this.menuItem_tablaTantargyakLekerdezes.addActionListener(this);
        this.menuItem_tablaKerdesekUj.addActionListener(this);
        this.menuItem_tablaKerdesekModositas.addActionListener(this);
        this.menuItem_tablaKerdesekTorles.addActionListener(this);
        this.menuItem_tablaKerdesekLekerdezes.addActionListener(this);
        this.menuItem_tablaLehetsegesValaszokModositas.addActionListener(this);
        this.menuItem_tablaLehetsegesValaszokLekerdezes.addActionListener(this);
        this.menuItem_tablaHelyesValaszokModositas.addActionListener(this);
        this.menuItem_tablaHelyesValaszokLekerdezes.addActionListener(this);
        this.menuItem_tablaKreditNyeremenyModositas.addActionListener(this);
        this.menuItem_tablaKreditNyeremenyLekerdezes.addActionListener(this);
        this.menuItem_tablaSugoModositas.addActionListener(this);
        this.menuItem_tablaSugoLekerdezes.addActionListener(this);
        this.menuItem_tablaPuskaModositas.addActionListener(this);
        this.menuItem_tablaPuskaLekerdezes.addActionListener(this);


        this.setSize(600,400);
        this.setLocation(300, 300);
        this.setVisible(true);
    }


    
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(menuItem_tablaHallgatoUj)){
            this.dialog_hallgatoUjDialog.elokeszit();
            this.dialog_hallgatoUjDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaHallgatoTorles)){
            this.dialog_hallgatoTorlesDialog.elokeszit();
            this.dialog_hallgatoTorlesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaHallgatoLekerdezes)){
            this.dialog_hallgatoLekerdezesDialog.elokeszit();
            this.dialog_hallgatoLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSzobaUj)){
            this.dialog_szobaUjDialog.elokeszit();
            this.dialog_szobaUjDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSzobaTorles)){
            this.dialog_szobaTorlesDialog.elokeszit();
            this.dialog_szobaTorlesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSzobaModositas)){
            this.dialog_szobaModositasDialog.elokeszit();
            this.dialog_szobaModositasDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSzobaLekerdezes)){
            this.dialog_szobaLekerdezesDialog.elokeszit();
            this.dialog_szobaLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaTantargyakUj)){
            this.dialog_tantargyakUjDialog.elokeszit();
            this.dialog_tantargyakUjDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaTantargyakTorles)){
            this.dialog_tantargyakTorlesDialog.elokeszit();
            this.dialog_tantargyakTorlesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaTantargyakModositas)){
            this.dialog_tantargyakModositasDialog.elokeszit();
            this.dialog_tantargyakModositasDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaTantargyakLekerdezes)){
            this.dialog_tantargyakLekerdezesDialog.elokeszit();
            this.dialog_tantargyakLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKerdesekUj)){
            this.dialog_kerdesekUjDialog.elokeszit();
            this.dialog_kerdesekUjDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKerdesekTorles)){
            this.dialog_kerdesekTorlesDialog.elokeszit();
            this.dialog_kerdesekTorlesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKerdesekModositas)){
            this.dialog_kerdesekModositasDialog.elokeszit();
            this.dialog_kerdesekModositasDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKerdesekLekerdezes)){
            this.dialog_kerdesekLekerdezesDialog.elokeszit();
            this.dialog_kerdesekLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaLehetsegesValaszokModositas)){
            this.dialog_lehetsegesValaszokModositasDialog.elokeszit();
            this.dialog_lehetsegesValaszokModositasDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaLehetsegesValaszokLekerdezes)){
            this.dialog_lehetsegesValaszokLekerdezesDialog.elokeszit();
            this.dialog_lehetsegesValaszokLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaHelyesValaszokModositas)){
            this.dialog_helyesValaszokModositasDialog.elokeszit();
            this.dialog_helyesValaszokModositasDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaHelyesValaszokLekerdezes)){
            this.dialog_helyesValaszokLekerdezesDialog.elokeszit();
            this.dialog_helyesValaszokLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKreditNyeremenyModositas)){
            this.dialog_kreditNyeremenyModositasDialog.elokeszit();
            this.dialog_kreditNyeremenyModositasDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaKreditNyeremenyLekerdezes)){
            this.dialog_kreditNyeremenyLekerdezesDialog.elokeszit();
            this.dialog_kreditNyeremenyLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaPuskaModositas)){
            this.dialog_puskaModositasDialog.elokeszit();
            this.dialog_puskaModositasDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaPuskaLekerdezes)){
            this.dialog_puskaLekerdezesDialog.elokeszit();
            this.dialog_puskaLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSugoLekerdezes)){
            this.dialog_sugoLekerdezesDialog.elokeszit();
            this.dialog_sugoLekerdezesDialog.setVisible(true);
        }
        if(actionEvent.getSource().equals(menuItem_tablaSugoModositas)){
            this.dialog_sugoModositasDialog.elokeszit();
            this.dialog_sugoModositasDialog.setVisible(true);
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
