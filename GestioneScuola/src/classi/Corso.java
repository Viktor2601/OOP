package classi;

import java.time.LocalDate;



public class Corso {
    private String nomeCorso = "-----";
    private String descrizioneCorso = "-----";
    private int durataCorso;
    private LocalDate dataInizioCorso = LocalDate.now();
    private Alunno registro[] = new Alunno[30];

    public Corso() {
    }

    /**
     * costruttore della classe Corso che riceve come parametro solo il nome del
     * corso
     * 
     * @param nomeCorso nome del corso
     */
    public Corso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    /**
     * costruttore della classe Corso che riceve come parametri il nome del corso e
     * la durata in ore
     * 
     * @param nomeCorso   nome del corso
     * @param durataCorso duarata del corso in ore
     */
    public Corso(String nomeCorso, int durataCorso) {
        this.nomeCorso = nomeCorso;
        this.durataCorso = durataCorso;
    }

    /**
     * costruttore dellla classe Corso che riceve come parametri il nome del corso,
     * la durata in ore e la descrizione del corso
     * 
     * @param nomeCorso        nome del corso
     * @param durataCorso      durata del corso in ore
     * @param descrizioneCorso piccola descrzione che descrive il corso
     */
    public Corso(String nomeCorso, int durataCorso, String descrizioneCorso) {
        this.nomeCorso = nomeCorso;
        this.durataCorso = durataCorso;
        this.descrizioneCorso = descrizioneCorso;
    }

    /**
     * costruttore della classe Corso che riceve come parametri il nome del corso,
     * la durata in ore, la descrizione del corso e la data di inzio del corso
     * 
     * @param nomeCorso        nome del corso
     * @param durataCorso      durata del corso in ore
     * @param descrizioneCorso piccola descrzione che descrive il corso
     * @param dataInizioCorso  data di inizio del corso
     */
    public Corso(String nomeCorso, int durataCorso, String descrizioneCorso, LocalDate dataInizioCorso) {
        this.nomeCorso = nomeCorso;
        this.durataCorso = durataCorso;
        this.descrizioneCorso = descrizioneCorso;
        this.dataInizioCorso = dataInizioCorso;
    }

    public Corso(String nomeCorso, int durataCorso, String descrizioneCorso, int anno, int mese, int giorno ){
        this.nomeCorso = nomeCorso;
        this.durataCorso = durataCorso;
        this.descrizioneCorso = descrizioneCorso;
        setDataInizioCorso(anno, mese, giorno);
    }

    
    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        if (nomeCorso.length() > 0 && nomeCorso.length() < 30)
            this.nomeCorso = nomeCorso;
    }

    public String getDescrizioneCorso() {
        return descrizioneCorso;
    }

    public void setDescrizioneCorso(String descrizioneCorso) {
        this.descrizioneCorso = descrizioneCorso;
    }

    public int getDurataCorso() {
        return durataCorso;
    }

    public void setDurataCorso(int durataCorso) {
        if (durataCorso > 0 && durataCorso < 10000)
            this.durataCorso = durataCorso;
    }

    public LocalDate getDataInizioCorso() {
        return dataInizioCorso;
    }

    public void setDataInizioCorso(LocalDate dataInizioCorso) {
        this.dataInizioCorso = dataInizioCorso;
    }

    /**
     * imposta la data da data testo
     * @param dataInizioCorso formato YYYY-MM-DD 2022-02-03
     */
    public void setDataInizioCorso(String dataInizioCorso) {
        int anno = 0, mese = 0 , giorno = 0;
        
        String partiData[] = dataInizioCorso.split("-");
        try {
            anno = Integer.parseInt(partiData[0]);
            mese = Integer.parseInt(partiData[1]);
            giorno = Integer.parseInt(partiData[2]);
        } catch (Exception errore) {
            System.out.println("Data inserita non valida...");
        }

        LocalDate data = LocalDate.of(anno, mese, giorno);

        this.dataInizioCorso = data;
    }

       /**
     * imposta la data da data testo
     * @param dataInizioCorso formato YYYY-MM-DD 2022-02-03
     */
    public void setDataInizioCorso(int anno, int mese, int giorno) {
        if (anno < 0)
            return;
        
        if (mese <= 0 && mese > 12 )
            return;
        
        if (giorno <= 0 && giorno > 31)
            return;

        try {
            LocalDate data = LocalDate.of(anno, mese, giorno);
            this.dataInizioCorso = data;
        } catch (Exception errore) {
            System.out.println("Data inserita non valida...");
        }
        
    }

    public Alunno[] getRegistro() {
        return registro;
    }

    public void setRegistro(Alunno[] registro) {
        this.registro = registro;
    }

    /**
     * aggiunge un alunno al registro alla prima posizione disponibile";"

    }

    /**
     * stampa le informazioni riguardanti al corso
     */
    public void stampaInformazioniCorso() {
        System.out.println("\n\n-------SCHEDA CORSO-------");
        System.out.println("Nome del corso -> " + nomeCorso);
        System.out.println("Descrizione del corso -> " + descrizioneCorso);
        System.out.println("Durata del corso -> " + durataCorso);
        System.out.println("Data inizio del corso -> " + dataInizioCorso.toString());
        System.out.println("--------------------------");
    }

    /**
     * stampa il registro del corso
     */
    public void stampaRegistro() {
        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == null) {
                break;
            } else {
                registro[i].stampaDatiAlunni();
            }
        }
    }

    public String getInfo() {
        String ris ="";
        ris += "\n\n-------SCHEDA CORSO-------\n";
        ris +=   ("\nNome del corso -> " + nomeCorso);
        ris += ("\nDescrizione del corso -> " + descrizioneCorso);
        ris += ("\nDurata del corso -> " + durataCorso);
        ris += ("\nData inizio del corso -> " + dataInizioCorso.toString());
        return ris;
    }

    public String getCsv() {
        String ris ="";
        ris +=  nomeCorso + ";" + durataCorso + ";" + descrizioneCorso + ";" + dataInizioCorso.toString() + "\n";
        return ris;
    }
}