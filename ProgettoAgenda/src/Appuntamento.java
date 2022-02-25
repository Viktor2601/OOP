import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Appuntamento {
    // ATTRIBUTI
    private final LocalDate giorno;
    private final LocalTime oraInizio;
    private final LocalTime oraFine;
    private final String luogo;
    private final String conChi;

    // COSTRUTTORE
    public Appuntamento(LocalDate giorno, LocalTime inizio, LocalTime fine, String luogo, String conChi) {
        this.giorno = giorno;
        this.oraInizio = inizio;
        this.oraFine = fine;
        this.luogo = luogo;
        this.conChi = conChi;
    }

    // GETTER AND SobjETTER
    public LocalDate getGiorno() {
        return giorno;
    }

    public LocalTime getInizio() {
        return oraInizio;
    }

    public LocalTime getFine() {
        return oraFine;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getConChi() {
        return conChi;
    }

    // EQUALS HASHCODE
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conChi == null) ? 0 : conChi.hashCode());
        result = prime * result + ((oraFine == null) ? 0 : oraFine.hashCode());
        result = prime * result + ((giorno == null) ? 0 : giorno.hashCode());
        result = prime * result + ((oraInizio == null) ? 0 : oraInizio.hashCode());
        result = prime * result + ((luogo == null) ? 0 : luogo.hashCode());
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
        Appuntamento other = (Appuntamento) obj;
        if (conChi == null) {
            if (other.conChi != null)
                return false;
        } else if (!conChi.equals(other.conChi))
            return false;
        if (oraFine == null) {
            if (other.oraFine != null)
                return false;
        } else if (!oraFine.equals(other.oraFine))
            return false;
        if (giorno == null) {
            if (other.giorno != null)
                return false;
        } else if (!giorno.equals(other.giorno))
            return false;
        if (oraInizio == null) {
            if (other.oraInizio != null)
                return false;
        } else if (!oraInizio.equals(other.oraInizio))
            return false;
        if (luogo == null) {
            if (other.luogo != null)
                return false;
        } else if (!luogo.equals(other.luogo))
            return false;
        return true;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Hai un appuntamento con " + conChi + " il giorno " + giorno.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " nel luogo " + luogo + " dalle ore " + oraInizio + " alle ore " + oraFine; 
    }

    // METODI PUBLIC
    /**
     * l'appuntamento nuovo si accavallano in un altro con un pezzo
     * @param nuovo
     * @return
     */
    public boolean intersect (Appuntamento nuovo){
        if (!this.giorno.equals(nuovo.getGiorno())) return false;
        if (this.isAllDay() || nuovo.isAllDay()) return true;
        if (this.oraInizio.isBefore(nuovo.getInizio()) || this.oraFine.isAfter(nuovo.getInizio())) return true;
        return this.oraInizio.isBefore(nuovo.getFine()) || this.oraFine.isAfter(nuovo.getFine());

    }
    /**
     * controlla se l'appuntamento nuovo copre più appuntamenti
     * @param nuovo
     * @return
     */
    public boolean overlap (Appuntamento nuovo){
        return nuovo.oraInizio.isBefore(this.oraInizio) && nuovo.oraFine.isAfter(this.oraFine);
    }

    public boolean invalid (Appuntamento a){
        return intersect(a) || overlap(a);
    }

    public boolean isAllDay (){
        return oraInizio == LocalTime.MIN && oraFine == LocalTime.MAX;
    }


    

}
