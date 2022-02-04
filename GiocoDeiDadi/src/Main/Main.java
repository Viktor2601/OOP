package Main;

import Classi.Dado;
import Classi.Giocatore;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Giocatore giocatore1 = new Giocatore("Marco", 10, 2, 15);
        Dado dadoGiocatore = new Dado(6);
        Dado dadoBanco = new Dado(6);
        int conta = 0;
        
        do{
            conta ++;
            dadoGiocatore.lanciaDado();
            dadoBanco.lanciaDado();
            System.out.println("\n--------------------------------------------------");
            System.out.println(String.format("Giocata numero %s. Il giocatore ha giocatore fatto %s mentre il banco ha fatto %s", conta, 
                                                dadoGiocatore.getUltimoLancio(),dadoBanco.getUltimoLancio()));
            System.out.println("Il giocatoe ha " + giocatore1.getSoldi() + "€");
            System.out.println("--------------------------------------------------\n");
            


            if (dadoGiocatore.getUltimoLancio() > dadoBanco.getUltimoLancio()){
                giocatore1.incrementaSoldi(1);
            }
            else {
                giocatore1.decrementaSoldi(1);
            }
        }while(giocatore1.isContinua());
    }
}
