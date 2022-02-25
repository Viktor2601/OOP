import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        Appuntamento appunatmento01 =agenda.aggiungi(LocalDate.now(), LocalTime.of(18, 00), LocalTime.of(19, 00), "Ivrea", "Dio");
        Appuntamento appunatmento02 =agenda.aggiungi(LocalDate.now(), LocalTime.of(14, 00), LocalTime.of(16, 00), "Rivarolo", "Maria");
        agenda.stampa();
    }
}
