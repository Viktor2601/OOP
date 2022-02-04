package classi;

import javax.swing.JOptionPane;

public class Alunno {
    private String nome = "-----";
    private String cognome = "-----";
    private int eta;
    private String email = "-----";
    private String numeroTelefono = "-----";
    private Esame[] libretto = new Esame [30];

    /**
     * costruttore della classe Alunni vuota
     */
    public Alunno() {
    }

    /**
     * costeruttore della classe Alunni che riceve come parametri il nome, il
     * cognome e il numero di telefono del alunno
     * 
     * @param nome           del alunno
     * @param cognome        del alunno
     * @param numeroTelefono del alunno
     */
    public Alunno(String nome, String cognome, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * costruttore della classe Alunni che riceve come parametri il nome, il
     * cognome, il numero di telefono del alunno
     * 
     * @param nome           del alunno
     * @param cognome        del alunno
     * @param numeroTelefono del alunno
     * @param eta            del alunno
     */
    public Alunno(String nome, String cognome, String numeroTelefono, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.eta = eta;
    }

    /**
     * costruttore della classe Alunni che riceve come parametri il nome, il
     * cognome, il numero di telefono, l'email del alunno
     * 
     * @param nome           del alunno
     * @param cognome        del alunno
     * @param numeroTelefono del alunno
     * @param eta            del alunno
     * @param email          del alunno
     */
    public Alunno(String nome, String cognome, String numeroTelefono, int eta, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.eta = eta;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        cognome = cognome.trim(); // pulisce il cognome prima dopo da carattere speciali
        if (cognome.length() < 2) {
            JOptionPane.showMessageDialog(null, "Cognome inserito non valido");
            return;
        }

        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Esame[] getLibretto() {
        return libretto;
    }

    public void setLibretto(Esame esame) {
        for (int i = 0; i < libretto.length; i++) {
            if (libretto[i] == null) {
                libretto[i] = esame;
                return;
            }           
        }
    }

    /**
     * stampa la scheda del alunno
     */
    public void stampaDatiAlunni() {
        System.out.println("\n\n-------SCHEDA ALUNNO-------");
        System.out.println("Nome -> " + nome);
        System.out.println("Cognome -> " + cognome);
        System.out.println("Età -> " + eta);
        System.out.println("Numero di telefono -> " + numeroTelefono);
        System.out.println("Email -> " + email);
        System.out.println("---------------------------");
    }

}
