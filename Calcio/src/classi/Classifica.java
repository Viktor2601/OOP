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
public class Classifica implements Comparable<Classifica>{
    private final Squadra squadra;
    private int punti;
    private int goalFatti;
    private int goalSubiti;
    
    // COSTRUTTORE
    public Classifica(Squadra squadra){
        this(squadra,0,0,0);
    }
    
    public Classifica(Squadra squadra, int punti, int goalFatti, int goalSubiti) {
        this.squadra = squadra;
        this.punti = punti;
        this.goalFatti = goalFatti;
        this.goalSubiti = goalSubiti;
    }
    
    // GETTER AND SETTER 

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public int getGoalFatti() {
        return goalFatti;
    }

    public void setGoalFatti(int goalFatti) {
        this.goalFatti = goalFatti;
    }

    public int getGoalSubiti() {
        return goalSubiti;
    }

    public void setGoalSubiti(int goalSubiti) {
        this.goalSubiti = goalSubiti;
    }
    
    public String getNomeSquadra(){
        return squadra.getNome();
    }
    
    public Squadra getSquadra(){
        return squadra;
    }
    
    // EQUALS AND HASHCODE

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.squadra);
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
        final Classifica other = (Classifica) obj;
        if (!Objects.equals(this.squadra, other.squadra)) {
            return false;
        }
        return true;
    }
    
    // METODI PUBLIC
    
    public int addPunti(int punti){
         return this.punti += punti;
    }
    
    public int addGoalFatti(int goalFatti){
        return this.goalFatti += goalFatti;
    }
    
    public int addGoalSubiti(int goalSubiti){
         return this.goalSubiti += goalSubiti;
    }

    /**
     * compare le classifiche e le mette in ordine dal più grande al più piccolo 
     * @param c2 
     * @return 
     */
    @Override
    public int compareTo(Classifica c2) {
        int p1 = this.punti;
        return  c2.getPunti()-p1;
        
    }
     
    
}
