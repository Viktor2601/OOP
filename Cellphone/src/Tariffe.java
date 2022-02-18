public class Tariffe {
    // PROPRIETA
    private final String  daOperatore;
    private final String aOperatore;
    private final float prezzoAlMinuto;
    
    // COSTRUTTORE
    public Tariffe(String daOperatore, String aOperatore, float prezzoAlMinuto) {
        this.daOperatore = daOperatore;
        this.aOperatore = aOperatore;
        this.prezzoAlMinuto = prezzoAlMinuto;
    }
    
    // GETTER
    public String getDaOperatore() {
        return daOperatore;
    }
    public String getaOperatore() {
        return aOperatore;
    }
    public float getPrezzoAlMinuto() {
        return prezzoAlMinuto;
    }


    
}
