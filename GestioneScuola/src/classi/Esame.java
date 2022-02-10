package classi;

import java.time.LocalDate;

public class Esame {
    private String docente;
    private LocalDate data;
    private int voto;
    private String materia;
    private String note;

    public Esame( String docente, int voto, String materia) {
        this.docente = docente;
        this.voto = voto;
        this.materia = materia;
        data= LocalDate.now();
    }

   

    public String getDocente() {
        return docente;
    }

    public LocalDate getData() {
        return data;
    }

    public int getVoto() {
        return voto;
    }

    public String getMateria() {
        return materia;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
    
    
}
