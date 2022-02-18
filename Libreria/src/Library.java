import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {
    // PROPRIETÀ
    private final List<Book> listBook;
    private final List<Book> loanBook;

    // COSTRUTTORI
    public Library() {
        listBook = new ArrayList<>();
        loanBook = new ArrayList<>();
    }

    // GETTER

    public List<Book> getLibrary() {
        return listBook;
    }

    // METODI

    /**
     * 
     * @param book libro da aggiungere alla libreria
     * @return restituisce false se il libro è già presente nella libreria, mentere
     *         restituisce true se l'operazione è stata svolta correttamente
     */
    public boolean addBook(Book book) {
        boolean ok = true;

        for (Book b : listBook) {
            if (b.equals(book)) {
                ok = false;
            }
        }

        if (ok)
            listBook.add(book);

        return ok;
    }

    /**
     * da un libro in prestito
     * lancia un eccezione se il libro non è presente nella libreria
     * 
     * @param book libro da dare in prestito
     * @return ritorna false se il libro è già in prestito, ritorna true se
     *         l'operazione viene eseguita
     */
    public boolean loanBook(Book book) {
        boolean ok = true;

        // verificare se il libro è presente nella libreria
        boolean presente = false;
        for (Book b : listBook) {
            if (b.equals(book))
                presente = true;
        }

        if (!presente) throw new RuntimeException("Il libro non è presente nella libreria...");

        // libro già in prestito
        if (book.isPrestito()) return false;
        
        // do il libro in prestito
        book.setPrestito(true);
        book.setDataPresitto(LocalDateTime.now());
        loanBook.add(book);

        return ok;
    }

    /**
     * restituisce il libro alla libreria
     * @param book libro da restituire
     */
    public void returnBook(Book book) {

        // verificare se il libro è presente nella libreria
        boolean presnete = false;
        for (Book b : listBook) {
            if (b.equals(book))
                presnete = true;
        }

        if (!presnete) throw new RuntimeException("Il libro non è presente nella libreria...");

        if (!(book.isPrestito()))throw new RuntimeException("Il libro non era stato prestato impossibile restituirlo");

        book.setPrestito(false);
        book.setDataPresitto(null);
        loanBook.remove(book);
    }

    public void printLoans(){
        System.out.println("I libri in prestito sono:");
        for (Book b : loanBook){
            System.out.println("-" + b.toString() + "- data inizio prestito " + b.getDataPresitto());
        }

        
    }

    

}
