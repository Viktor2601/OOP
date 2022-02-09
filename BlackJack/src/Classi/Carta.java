package Classi;

import java.util.ArrayList;

public class Carta {
    public static enum Seme {
        CUORI, QUADRRI, FIORI, PICCHE
    }

    public static enum Nome {
        ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO,
        NOVE, DIECI, JACK, DONNA, RE
    }

    private final Seme seme;
    private final ArrayList<Integer> valoriPossibili;
    private int valore;
    private final Nome nome;

    public Carta(Seme seme, int valore, Nome nome) {
        this(seme, valore, nome, new ArrayList());
    }

    public Carta(Seme seme, int valore, Nome nome, ArrayList<Integer> valoriPossibili) {
        this.seme = seme;
        this.valore = valore;
        this.valoriPossibili = new ArrayList<>(valoriPossibili);
        this.nome = nome;
        if (this.valoriPossibili.isEmpty()) {
            this.valoriPossibili.add(valore);
        }
    }

    public Seme getSeme() {
        return seme;
    }

    public ArrayList<Integer> getValoriPossibili() {
        return valoriPossibili;
    }

    public int getValore() {
        return valore;
    }

    public Nome getNome() {
        return nome;
    }

    public void setValore(int valore) {
        if (!valoriPossibili.contains(valore)) {
            throw new IllegalArgumentException("Valore non previsto");
        }
        this.valore = valore;
    }

    @Override
    public String toString() {
        return this.nome.name() + " di " + this.seme.name();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((seme == null) ? 0 : seme.hashCode());
        result = prime * result + valore;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carta other = (Carta) obj;
        if (nome != other.nome)
            return false;
        if (seme != other.seme)
            return false;
        if (valore != other.valore)
            return false;
        return true;
    }


    
}
