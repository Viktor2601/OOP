package main;

import classi.Alunno;
import classi.Corso;
import classi.Tool;

public class Main {
    public static void main(String[] args) throws Exception {
        Corso corsoTss = new Corso("Tecnico sviluppo software", 1000);
        corsoTss.stampaInformazioniCorso();

        Alunno alunno1 = new Alunno("Giovanni", "Leveghi", "3795865211");
        corsoTss.aggiungiAlunno(alunno1);

        corsoTss.stampaRegistro();
    }
}
