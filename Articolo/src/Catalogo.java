import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Catalogo<E extends ArticoloI> implements Iterable {
    // ATTRIBUTI
    private List<E> catalogo = new ArrayList<>();

    // METODI PUBLIC
    public void aggiungiArticolo(E art) {
        catalogo.add(art);
    }

    public List<E> getArticoloSottoPrezzo(double prezzo) {
        Predicate<E> byPrezzo = a -> a.getPrezzo() < prezzo;
        return catalogo.stream().filter(byPrezzo).collect(Collectors.toList());
    }

    public String toString() {
        return catalogo.stream().map(ArticoloI::toString).collect(Collectors.joining("\n"));
    }

    public List<E> getCatalogo() {
        return Collections.unmodifiableList(catalogo);
    }

    // OVERRIDE ITERATOR
    @Override
    public Iterator iterator() {
        return catalogo.iterator();
    }

}
