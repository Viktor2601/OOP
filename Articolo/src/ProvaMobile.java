import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ProvaMobile {
    // METODI PUBLIC
    /**
     * 
     * @param catalogo
     * @param pre prezzo
     * @param lar larghezza
     * @param alt altezza 
     * @param prof profondità
     * @return
     */
    public static List<Mobile> scegliMobile(Catalogo<Mobile> cat, float pre, int lar, int alt, int prof){
        Predicate<Mobile> byPrezzo =  m -> m.getPrezzo() < pre;
        Predicate<Mobile> byLarghezza = m -> m.getLarghezza() < lar;
        Predicate<Mobile> byAltezza = m -> m.getAltezza() < alt;
        Predicate<Mobile> byProfondita = m -> m.getProfondita() < prof;
        return cat.getCatalogo().stream().filter(byPrezzo.and(byLarghezza).and(byAltezza).and(byProfondita)).collect(Collectors.toList());
    }
}
