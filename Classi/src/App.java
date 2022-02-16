import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       A  aa = new B(); // SI..
       // B bb = new A() NO..

       if (aa instanceof B){        // instanceof dice se una varabile è del dipo dinamico in questo caso B...
           System.out.println("-----------------");
       }

       C cc = new C();
       cc.m2();

       ArrayList<A> list = new ArrayList<>();
       list.add(new A());
       list.add(new B());
       list.add(new A());
       list.add(new C());

       eseguiM2(list);


    
    
    }

    public static void eseguiM2(ArrayList<A> list) {
        for (A a : list){
            a.m2();
        }
    }

}


