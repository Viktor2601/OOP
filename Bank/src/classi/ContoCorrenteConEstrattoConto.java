package classi;

import java.util.ArrayList;

public class ContoCorrenteConEstrattoConto extends ContoCorrente {

    private ArrayList <Integer> movimenti = new ArrayList<>();

    public ContoCorrenteConEstrattoConto(String intestatario) {
        super(intestatario);
    }

    public ArrayList <Integer> getMovimenti (){
        return new ArrayList(this.movimenti);
    }

    @Override
    public void deposito(int importo) {
        super.deposito(importo);
        movimenti.add(importo);
    }

    @Override
    public void prelievo(int importo) {
        super.prelievo(importo);
        movimenti.add(-importo);
    }
    
}
