package classi;

import java.time.LocalDate;

public class Cittadino {
    private String nome;
    private String cognome;
    private final String dataDiNascita; // formato gg-mm-aa
    private final String luogoNatale;
    private final String CF;
    private String indirizzoDiResidenza;
    private int eta;
    

    // COSTRUTTORI
    public Cittadino(String nome, String cognome, String dataDiNascita,String luogoNatale, String CF, String indirizzoDiResidenza) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.luogoNatale = luogoNatale;
        this.CF = CF;
        this.indirizzoDiResidenza = indirizzoDiResidenza;
        this.eta = calcolaEta(this.dataDiNascita);
    }

    /**
     * mi calcola l'età del cittadino sapendo la data di nascita
     * @param dataDiNascita
     * @return
     */
    private int calcolaEta (String dataDiNascita){
        int risultato;
        LocalDate data = LocalDate.now();
        int annoCorrente = data.getYear();
        String parti[] = dataDiNascita.split("-");
        risultato = annoCorrente - Integer.parseInt(parti[2]); 
        return risultato;
    }

    // GETTER E SETTER 
    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public String getCF() {
        return CF;
    }

    public String getLuogoNatale() {
        return luogoNatale;
    }

    public String getIndirizzoDiResidenza() {
        return indirizzoDiResidenza;
    }

    public void setIndirizzoDiResidenza(String indirizzoDiResidenza) {
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    public void setEta(int eta) {
        this.eta = calcolaEta(this.dataDiNascita);
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return String.format("""
        Cittadino : 
        Nome -> %s
        Cognome -> %s
        Età -> %s
        Nato -> %s
        CF -> %s
        Indirizzo di residenza -> %s
        Data di nascita -> %s
        """,this.nome, this.cognome, this.eta, this.luogoNatale, this.CF, this.indirizzoDiResidenza, this.dataDiNascita);
    }





    



    
}
