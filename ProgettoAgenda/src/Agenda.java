import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Agenda {
    // ATTRIBUTI
    private final List<Appuntamento> elencoAppuntamenti = new ArrayList();

    // METODI PUBLIC                                                                       // throws obbliga a gestire le eccezzioni quando viene richiamato il metodo
    public Appuntamento aggiungi(LocalDate giorno, LocalTime inizio, LocalTime fine, String luogo, String conChi) throws AgendaException { 
        // controlli
        inizio = Objects.requireNonNullElse(inizio, LocalTime.MIN);
        fine =Objects.requireNonNullElse(fine, LocalTime.MAX);
        Objects.requireNonNull(giorno);
        if(giorno.isBefore(LocalDate.now())){
            throw new AgendaException("Data appuntamento precedente ad oggi");
        }
        // creo l'appuntamento        
        Appuntamento appuntamento = new Appuntamento(giorno, inizio, fine, luogo, conChi);
        // verifico che non coincida con altri appuntamenti
        boolean isInvalid =elencoAppuntamenti.stream().anyMatch(v -> v.invalid(appuntamento));
        if(isInvalid){
            throw new AgendaException("L'appuntamento si sovrappone con un altro appuntamento");
        }
        
        // aggiungo l'appuntamento alla lista appuntamenti        
        elencoAppuntamenti.add(appuntamento);
        return appuntamento;
    }

    /**
     * cancella un appuntamento passando come parametroun appuntamento
     * @param appuntamento
     */
    public void cancella (Appuntamento appuntamento) {
        elencoAppuntamenti.remove(appuntamento); // a remove si può passare anche un oggetto e lui lo cancella se lo trova
    }

    /**
     * cancella tutti gli appuntamenti con la data o la perosna o il luogo
     * @param data
     */
    public void cancella (LocalDate data, String conChi, String luogo) {
        elencoAppuntamenti.removeAll(cerca(data, conChi, luogo));
    }

    public List<Appuntamento> cerca (LocalDate data, String conChi, String luogo){
        // Predicate è un iterfaccia funzionale che ritorna vero o falso
        Predicate<Appuntamento> byData = v -> data == null || v.getGiorno().equals(data);
        Predicate<Appuntamento> byLuogo = v -> luogo == null || luogo.isBlank() || v.getLuogo().equals(luogo);
        Predicate<Appuntamento> byPersona = v -> conChi == null || conChi.isBlank() || 
                                                    v.getConChi().trim().toLowerCase().equals(conChi.trim().toLowerCase()); // trim() toglie gli spazzi

        return elencoAppuntamenti.stream().filter(byData.and(byLuogo).and(byPersona)).collect(Collectors.toList());
        // .stream() -> trasforma la lista in stream
        // .filter() -> se è vero lo mette, se è falso non lo mette nello stream 
        // .collect -> passa dallo stream a una collezione
        // Collectors -> è una classe 
       
    }

    public void stampa(){
        System.out.println("----------------------------------AGENDA----------------------------------");
        //elencoAppuntamenti.forEach( p -> System.out.println(p)); // funziona lambda 
        //elencoAppuntamenti.forEach(System.out::println); // metodo refernce
        elencoAppuntamenti.forEach(this::stampaAppuntamento); // mi sono fatto un Consumer mio e lo passo tramite refernce
    }

    // METODI PRIVATE
    private void stampaAppuntamento(Appuntamento a){
        System.out.println(a);
    }
    
}
