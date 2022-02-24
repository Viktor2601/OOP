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
public class Squadra {
    // ATTRIBUTI
    private String nome;
    private String sede;
    
    
    // COSTRUTTORE
    public Squadra(String nome, String sede) {
        this.nome = nome;
        this.sede = sede;
    }
    
    
    // GETTER AND SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    // EQUALS AND HASHCODE
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.sede);
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
        final Squadra other = (Squadra) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sede, other.sede)) {
            return false;
        }
        return true;
    }
    
    
    // METODI PUBLIC 
    /**
     * ti da una stringa della sqaudra salvabile in un file CSV
     * @return 
     */
    public String squadraCsv(){
        String csv = nome + ";" + sede + "\n";     
        return csv;      
    }
    
    
    
}
