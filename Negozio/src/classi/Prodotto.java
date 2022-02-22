/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classi;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Prodotto {
    // attributi della classe    
    private final int id;
    private String nome; 
    private final float prezzoConIva;
    private final float prezzoSenzaIva;
    private final int IVA;
    
    private static int idCorrente;

    // COSTRUTTORE
    public Prodotto(String nome, float prezzoSenzaIva, int IVA) {
        this.id = calcolaId();
        this.nome = nome;
        this.prezzoSenzaIva = prezzoSenzaIva;
        this.IVA = IVA;
        this.prezzoConIva = calcolaPrezzoConIva();
    }

    public Prodotto(int id, String nome,  float prezzoSenzaIva, int IVA, float prezzoConIva) {
        this.id = id;
        this.nome = nome;
        this.prezzoConIva = prezzoConIva;
        this.prezzoSenzaIva = prezzoSenzaIva;
        this.IVA = IVA;
    }
    
    
    
    // GETTER e SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzoConIva() {
        return prezzoConIva;
    }


    public float getPrezzoSenzaIva() {
        return prezzoSenzaIva;
    }


    public static int getIdCorrente() {
        return idCorrente;
    }

    public static void setIdCorrente(int idCorrente) {
        Prodotto.idCorrente = idCorrente;
    }

    public int getId() {
        return id;
    }

    public int getIVA() {
        return IVA;
    }
    
     
    // EQUALS e HASHCODE 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Float.floatToIntBits(this.prezzoSenzaIva);
        hash = 89 * hash + this.IVA;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prodotto other = (Prodotto) obj;
        if (Float.floatToIntBits(this.prezzoSenzaIva) != Float.floatToIntBits(other.prezzoSenzaIva)) {
            return false;
        }
        if (this.IVA != other.IVA) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    // METODI PRIVATE
    /**
     * calcola un id nuovo da dare al prodotto
     * @return 
     */
    private int calcolaId (){
         return idCorrente++;
     }
     
     /**
      * calcola il prezzo con IVA
      * @return 
      */
     private float calcolaPrezzoConIva(){
         return  prezzoSenzaIva + (prezzoSenzaIva * IVA / 100);
     }
     
     /**
      * verifiva se l'IVA va bene
      * @param Iva da verificare
      * @return ritorna true se va bene se no false
      */
     public static boolean verificaIva(int Iva){
         boolean risultato = false;
         
         if (Iva == 4 || Iva == 10 || Iva == 22) risultato = true;
         
         return risultato;
     }
     
     // METODO PUBBLICO
     /**
      * stampa la scheda prodotto
      */
     public void schedaProdotto() {
         System.out.println("\n----- SCHEDA PRODOTTO -----");
         System.out.println("ID -> " + id);
         System.out.println("Nome prodotto -> " + nome);
         System.out.println("Prezzo -> " + prezzoConIva);
     }
     
     public String getSchedaProdotto(){
         String info = "";
         info +="\n----- SCHEDA PRODOTTO -----\n";
         info += "ID -> " + id +"\n";
         info += "Nome prodotto -> " + nome +"\n";
         info += "Prezzo senza IVA -> " + prezzoSenzaIva +"\n";     
         info += "IVA -> " + IVA +"\n";
         info += "Prezzo con IVA -> " + prezzoConIva +"\n";   
         return info;
     }
     
     /**
      * ti da il prodotto in una Stringa salvabile in un file CSV
      * @return 
      */
     public String prodottoCsv(){
         String csv = id + ";" + nome + ";" + prezzoSenzaIva + ";"  + IVA + ";" +prezzoConIva + "\n";
         return csv;
     }
    
   
}
