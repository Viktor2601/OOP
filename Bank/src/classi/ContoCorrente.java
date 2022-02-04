package classi;

public class ContoCorrente {
    
    private String intestatario;
    private int saldo;

    public ContoCorrente(String intestatario) {
        if (intestatario == null || intestatario.isBlank()) {
            throw new IllegalArgumentException("Intestatario vuoto");
        }
        this.intestatario = intestatario;
    }

    public void deposito(int importo) {
        if (importo <= 0) {
            throw new IllegalArgumentException("Importo uguale o minore di zero");
        }
        this.saldo += importo;
    }

    public void prelievo(int importo) {
        if (importo <= 0) {
            throw new IllegalArgumentException("Importo uguale o minore di zero");
        }

        if (importo > this.saldo) {
            throw new IllegalArgumentException("Importo non disponibile");
        }

        this.saldo -= importo;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public int getSaldo() {
        return saldo;
    }
}
