/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classi.Partita;
import classi.Squadra;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Csv {
    // METODI PROTECTED

    /**
     * salva le sqaudre in file CSV
     */
    protected static void salvaSquadraCsv() {
        // preparo la stringa da salvare nel file
        String csv = "nome;sede\n";
        for (Squadra s : WinCalcio.elencoSquadre) {
            csv += s.squadraCsv();
        }

        // salvo la stringa dentro il file
        try {
            // creo il file listacorsi.csv
            FileWriter myWriter = new FileWriter(pathProgetto() + "/file/squadre.csv");
            // salvo la roba dentro
            myWriter.write(csv);
            // lo chiudo 
            myWriter.close();
        } catch (Exception e) {
        }
    }

    /**
     * recupera le squadre dal file csv
     */
    protected static void caricaSqaudraCsv() {
        try {
            File filecsv = new File(pathProgetto() + "/file/squadre.csv");
            Scanner lettore = new Scanner(filecsv);

            String riga = lettore.nextLine(); // salto la prima riga perchè p quella che c'è scritta l'intestazione

            while (lettore.hasNextLine()) {
                riga = lettore.nextLine();
                String dati[] = riga.split(";");
                String nome = dati[0];
                String sede = dati[1];
                Squadra squadra = new Squadra(nome, sede);
                WinCalcio.elencoSquadre.add(squadra);
            }

        } catch (Exception e) {
        }
    }

    /**
     * salva le partite nel file CSV
     */
    protected static void salvaPartiteCsv() {
        // preparo la stringa da salvare nel csv
        String csv = "giornata;squadracasa;squadratrasferta;goalcasa;goaltrasferta\n";
        for (Partita p : WinCalcio.elencoPartite) {
            csv += p.partitaCsv();
        }

        // salvo la stringa nel file
        try {
            // creo il file listacorsi.csv
            FileWriter myWriter = new FileWriter(pathProgetto() + "/file/partite.csv");
            // salvo la roba dentro
            myWriter.write(csv);
            // lo chiudo 
            myWriter.close();
        } catch (Exception e) {
        }
    }

    protected static void caricaPartiteCsv() {
        try {
            File filecsv = new File(pathProgetto() + "/file/partite.csv");
            Scanner lettore = new Scanner(filecsv);

            String riga = lettore.nextLine();

            while (lettore.hasNextLine()) {
                riga = lettore.nextLine();
                String dati[] = riga.split(";");
                int giornata = Integer.parseInt(dati[0]);
                String squadraCasa = dati[1];
                String sqaudraTrasferta = dati[2];
                int goalCasa = Integer.parseInt(dati[3]);
                int goalTrasferta = Integer.parseInt(dati[4]);
                Partita partita = new Partita(giornata, squadraCasa, sqaudraTrasferta, goalCasa, goalTrasferta);
                WinCalcio.elencoPartite.add(partita);
            }
        } catch (Exception e) {
        }

    }

    // METODI PRIVATE
    /**
     * ritorna il path del progetto
     *
     * @return
     * @throws IOException
     */
    private static String pathProgetto() throws IOException {
        File f1 = new File("");
        String path = f1.getCanonicalPath(); // ti da il percorso fino alla root del progetto
        return path;
    }

 

}
