package Classi;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;

import Classi.Carta.Nome;

public class Mazzo {
    private ArrayList<Carta> carte;
    private static final int NUMERO_CARTE = 52;

    public Mazzo(){       
        carte = new ArrayList<>(NUMERO_CARTE);
        creaMazzo();
    }

    private void creaMazzo() {
        EnumSet<Carta.Seme> semi = EnumSet.allOf(Carta.Seme.class);
        for(Carta.Seme seme : semi){
            for (int i = 1; i <=13; i++){ 
                Carta.Nome nome = Carta.Nome.values()[i-1];
                if(i == 1){
                    // asso
                    ArrayList<Integer> valori = new ArrayList<>(2);
                    valori.add(1);
                    valori.add(11);
                    carte.add(new Carta(seme,i,nome, valori));
                } else if (i >= 10) {
                    // figure
                    carte.add(new Carta(seme,10,nome));
                } else {
                    // carte da 2 a 9
                    carte.add(new Carta(seme, i,nome));
                }
            }
        }
    }

    public Carta pesca(){
        Random rnd = new Random();
        int indice = rnd.nextInt(carte.size());
        Carta risultato = carte.get(indice);
        carte.remove(indice);
        return risultato;
    }

    @Override
    public String toString() {
        String risultato = "";
        for (Carta carta : carte){
            risultato += carta.toString() + "\n";
        }
        return risultato;
    }


    
    
}
