public class Mobile implements ArticoloI {
    // ATTRIBUTI
    private final String nome;
    private final int prezzo;
    private final int larghezza;
    private final int altezza;
    private final int profondita;
    
    
    // COSTRUTTORE
    public Mobile(String nome, int prezzo, int larghezza, int altezza, int profondita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }


    // OVERRIDE METODI ARTICOLOI
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Articolo " + nome + " - Prezzo " + prezzo;
    }

    
    // GETTER
    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getProfondita() {
        return profondita;
    }

    

    
    
}
