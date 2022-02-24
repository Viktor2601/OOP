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
public class Partita {
    // ATTRIBUTI
    private final int giornata;
    private String squadraCasa;
    private String squadraTrasferta;
    private int goalCasa;
    private int goalTrasferta;
    
    
    // COSTRUTTORE
    public Partita(int giornata, String squadraCasa, String sqaudraTrasferta, int goalCasa, int goalTrasferta) {
        this.giornata = giornata;
        this.squadraCasa = squadraCasa;
        this.squadraTrasferta = sqaudraTrasferta;
        this.goalCasa = goalCasa;
        this.goalTrasferta = goalTrasferta;
    }
    
    
    // GETTER AND SETTER 
    public int getGiornata(){
        return giornata;
    }
    
    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }


    public int getGoalCasa() {
        return goalCasa;
    }

    public String getSquadraTrasferta() {
        return squadraTrasferta;
    }

    public void setSquadraTrasferta(String squadraTrasferta) {
        this.squadraTrasferta = squadraTrasferta;
    }

    public void setGoalCasa(int goalCasa) {
        this.goalCasa = goalCasa;
    }

    public int getGoalTrasferta() {
        return goalTrasferta;
    }

    public void setGoalTrasferta(int goalTrasferta) {
        this.goalTrasferta = goalTrasferta;
    }

    @Override
    public int hashCode(){
        int hash = 3;
        hash = 47 * hash + this.giornata;
        hash = 47 * hash + Objects.hashCode(this.squadraCasa);
        hash = 47 * hash + Objects.hashCode(this.squadraTrasferta);
        return hash;
    }

    // EQUALS AND HASHCODE
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
        final Partita other = (Partita) obj;
        if (this.giornata != other.giornata) {
            return false;
        }
        if (!Objects.equals(this.squadraCasa, other.squadraCasa)) {
            return false;
        }
        if (!Objects.equals(this.squadraTrasferta, other.squadraTrasferta)) {
            return false;
        }
        return true;
    }

    // METODO PUBLIC
    /**
     * ritorna una stringa con le informazioni della partita in formato CSV
     * @return 
     */
    public String partitaCsv() {
        String csv = giornata + ";" + squadraCasa + ";" + squadraTrasferta + ";" + goalCasa + ";" + goalTrasferta + "\n";
        return csv;
    }
    
    
    
}
