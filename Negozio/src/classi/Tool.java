/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classi;

import gui.Home;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tool {

    /**
     * salva i prodotti in un file CSV
     */
    public static void salvaCorsiCsv() {
        String csv = "idprodotto;nomeprodotto;prezzosenzaiva;iva;prezzoconiva\n";
        // scorro i corsi
        for (Prodotto p : Home.listaProdotti) {
            csv += p.prodottoCsv();
        }

        // salvo dentro il file listacorsi.csv
        try {
            // creo il file listacorsi.csv
            FileWriter myWriter = new FileWriter("/home/tss/Viktor/OOP/Negozio/file/listaprodotti.csv");
            // salvo la roba dentro
            myWriter.write(csv);
            // lo chiudo 
            myWriter.close();
        } catch (IOException errore) {
            JOptionPane.showMessageDialog(null, "Salvataggio file listaprodotti.csv non andato a buonfine...");
        }
    }

    /**
     * restituisce una stringa pronta per esssere visualizzata
     */
    public static String  displayListaCorsi() {
        String testo = "";
        for (Prodotto p : Home.listaProdotti) {
            testo += p.getSchedaProdotto();
        }
        
        return testo;
    }

    /**
     * recupero da /home/tss/Viktor/OOP/Negozio/file/listaprodotti.csv la lista
     */
    public static void caricaListaProdotti() {
        try {
            File filecsv = new File("/home/tss/Viktor/OOP/Negozio/file/listaprodotti.csv");
            Scanner lettore = new Scanner(filecsv);

            String riga = lettore.nextLine(); // salto la prima riga perchè p quella che c'è scritta l'intestazione

            while (lettore.hasNextLine()) {
                riga = lettore.nextLine();
                String dati[] = riga.split(";");
                int idProdotto = Integer.parseInt(dati[0]);
                String nomeProdotto = dati[1];
                float prezzoSenzaIva = Float.parseFloat(dati[2]);
                int iva = Integer.parseInt(dati[3]);
                float prezzoConIva = Float.parseFloat(dati[4]);
                Prodotto prodotto = new Prodotto(idProdotto, nomeProdotto, prezzoSenzaIva, iva, prezzoConIva);
                Home.listaProdotti.add(prodotto);
                int index = Home.listaProdotti.size();
                int id = Home.listaProdotti.get(index-1).getId();
                Prodotto.setIdCorrente(id+1);
                
            }

        } catch (Exception errore) {
            JOptionPane.showMessageDialog(null, "Il caricamento del file non è andato a buonfine...");
        }

    }
}
