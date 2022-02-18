import java.util.HashSet;
import java.util.Set;

public class Cellphone {    
    // PROPRIETA
    private final String operatore;
    private final String numero;
    private final static Set<Tariffe> costList = new HashSet<>();
    
    // COSTRUTTORE 
    public Cellphone(String operatore, String numero) {
        this.operatore = operatore;
        this.numero = numero;
    }

    // GETTER 
    public String getOperatore() {
        return operatore;
    }

    public String getNumero() {
        return numero;
    }


    // MEoperatoreTODI
    /**
     * aggiunge una tariffa alla sua lista
     * @param t tariffa da aggiungere
     * @return ritorna false se la tariffa è già presente, ritorna true se l'ha inserita
     */
    public static boolean setCost(Tariffe t){
        return costList.add(t);
    }

    /**
     * calcola il costo di una chiamata da un operatore verso un determinato operatore 
     * @param operatore operatore che riceve la chiamata
     * @param minuti che dura la chiamata
     * @return ritrona -1 se non esiste la tariffa verso quel operatore se no ritona il costo
     */
    public float getCost(String operatore, int minuti){
        float risultato = -1;

        for (Tariffe t : costList){
            if (this.operatore.equalsIgnoreCase(t.getDaOperatore()) && operatore.equals(t.getaOperatore())){
                risultato = t.getPrezzoAlMinuto() * minuti;
            }
        }


        return risultato;
    }






    

}
