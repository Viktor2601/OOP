package Classi;

public class Giocatore {

    private String nome;
    private int soldi;
    private final int minSoldi;
    private final int maxSoldi;
    

    /**
     * costruttore della classe giocatore che riceve come parametri il nome e i
     * soldi
     * 
     * @param nome
     * @param soldi
     */
    public Giocatore(String nome, int soldi, int minSoldi, int maxSoldi) {
        this.nome = nome;
        this.soldi = soldi;
        this.minSoldi = minSoldi;
        this.maxSoldi = maxSoldi;
    }

    public int getSoldi() {
        return soldi;
    }

    public void incrementaSoldi(int quantoIncrementa) {
        soldi = soldi + quantoIncrementa;
    }

    public void decrementaSoldi(int quantoDecrementa) {
        soldi = soldi - quantoDecrementa;
    }

    public boolean isContinua () {
        return soldi > minSoldi && soldi < maxSoldi;
    }
}
