package Classi;

import java.util.Random;

public class Dado {

    private final int numeroFaccie;
    private int ultimoLancio;

    public Dado(int numeroFaccie) {
        this.numeroFaccie = numeroFaccie;
    }

    public int getNumeroFaccie() {
        return numeroFaccie;
    }

    public int getUltimoLancio() {
        return ultimoLancio;
    }

    public void lanciaDado() {
        Random rnd = new Random();
        ultimoLancio = rnd.nextInt(numeroFaccie) + 1;
    }

}
