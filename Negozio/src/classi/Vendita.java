/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classi;

import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Vendita {
    // attributi della classe
    private final int idVendita;
    private Prodotto prodottoDaVendere;
    private int quantita;
    private LocalDateTime dataVendita;
    private float totale;
    
    private static int idCorrente = 0;
    
    // COSTRUTTORE

    public Vendita(Prodotto prodottoDaVendere, int quantita, LocalDateTime dataVendita, float totale) {
        this.idVendita = calcolaId();
        this.prodottoDaVendere = prodottoDaVendere;
        this.quantita = quantita;
        this.dataVendita = dataVendita;
        this.totale = totale;
    }
    
    // GETTER e SETTER

    public Prodotto getProdottoDaVendere() {
        return prodottoDaVendere;
    }

    public void setProdottoDaVendere(Prodotto prodottoDaVendere) {
        this.prodottoDaVendere = prodottoDaVendere;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public LocalDateTime getDataVendita() {
        return dataVendita;
    }

    public void setDataVendita(LocalDateTime dataVendita) {
        this.dataVendita = dataVendita;
    }

    public float getTotale() {
        return totale;
    }

    public void setTotale(float totale) {
        this.totale = totale;
    }

    public static int getIdCorrente() {
        return idCorrente;
    }

    public static void setIdCorrente(int idCorrente) {
        Vendita.idCorrente = idCorrente;
    }
    
    
    
    
     // METODI PRIVATE
    /**
     * calcola un nuovo id da assegnare alla vendita
     * @return 
     */
     private int calcolaId (){
         return idCorrente++;
     }
    
    
    
}
