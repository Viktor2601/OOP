
import java.time.LocalDateTime;

public class Book {
    // PROPRIETÀ 
    private final String title;
    private boolean prestito = false;
    private LocalDateTime dataPresitto;

    
    //COSTRUTTORI
    public Book(String title) {
        this.title = title;
    }


    // GETTER SETTER
    public String getTitle() {
        return title;
    }

    public boolean isPrestito() {
        return prestito;
    }


    public void setPrestito(boolean prestito) {
        this.prestito = prestito;
    }


    public LocalDateTime getDataPresitto() {
        return dataPresitto;
    }


    public void setDataPresitto(LocalDateTime dataPresitto) {
        this.dataPresitto = dataPresitto;
    }


    // EQUALS HASH CODE
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
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
        Book other = (Book) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    // TO STRING 
    @Override
    public String toString() {
        String msg = "Nome del libro:" + getTitle();
        return msg;
    }

    



    

    
}
