package classi;

import javax.swing.JOptionPane;

public class Tool {
  
    /**
     * standardizza il numero di telefono togliendo gli spazi ed eventuali segni dentro il numero di telefono e aggiunge il prefisso se manca
     * prefisso
     * @param numeroTelefono numero di telefono da standardizzare
     * @param prefisso 
     * @return ritorna il numero telefonico standardizzato con il prefisso 
     */
    public static String checktel (String numeroTelefono, String prefisso)
    {
        String numeroCheck = "";

        numeroTelefono = numeroTelefono.replace(" ", "");
        numeroTelefono = numeroTelefono.replace("-", "");
        numeroTelefono = numeroTelefono.replace(",", "");
        numeroTelefono = numeroTelefono.replace(".", "");
        numeroTelefono = numeroTelefono.replace("(", "");
        numeroTelefono = numeroTelefono.replace(")", "");

        try {
            long check = Long.parseLong(numeroTelefono);
            String prefissoCheck = numeroTelefono.substring(0, 3);
            
            if (prefissoCheck.equals(prefisso)) {
                numeroCheck = numeroTelefono;
            } else {
                numeroCheck = prefisso + numeroTelefono;
            }

        } catch (Exception errore) {
            JOptionPane.showMessageDialog(null, "Il numero inserito non è valido");
        }

        return numeroCheck;
    }
    
     /**
     * standardizza il numero di telefono togliendo gli spazi ed eventuali segni dentro il numero di telefono e aggiunge il prefisso +39 se manca     * 
     * 
     * @param numeroTelefono numero di telefono da standardizzare
     * @return ritorna il numero telefonico standardizzato con il prefisso +39
     */
    public static String checkTel(String numeroTelefono) {
        return checktel(numeroTelefono, "+39");
    }
}
