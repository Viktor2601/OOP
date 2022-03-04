import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        Catalogo cat = new Catalogo<Mobile>();
        Mobile m1 = new Mobile("Comodino di legno di Abete", 1500);
        Mobile m2 = new Mobile("Tavolo di faggio", 800);
        cat.aggiungiArticolo(m1);
        cat.aggiungiArticolo(m2);

        List<Mobile> mobiliSotto1000 =cat.getArticoloSottoPrezzo(1000);
        mobiliSotto1000.forEach(m -> System.out.println(m));
        System.out.println("----------------------------------------------------------------------");

        System.out.println(cat.toString());
        */

        Catalogo cat = new Catalogo<Mobile>();
        Mobile m1 = new Mobile("Comodino", 1500,20, 10, 5);
        Mobile m2 = new Mobile("Tavolo", 2000,250, 1500, 200);
        Mobile m3 = new Mobile("Sedia", 5000,10, 50, 20);
        Mobile m4 = new Mobile("Casettiera", 10000,200, 150, 50);
        cat.aggiungiArticolo(m1);
        cat.aggiungiArticolo(m2);
        cat.aggiungiArticolo(m3);
        cat.aggiungiArticolo(m4);
        System.out.println(cat.toString());
        System.out.println("------------------------------------------------------------------------------");
        List<Mobile> fil = ProvaMobile.scegliMobile(cat, 3000,260, 60,210);
        fil.forEach(m -> System.out.println(m));
    }
}
