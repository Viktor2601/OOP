public class Main {
    public static void main(String[] args) throws Exception {
       
        Cellphone c1 = new Cellphone("TIM", "123456789");
        Cellphone c2 = new Cellphone("WIND", "9876543210");

        Cellphone.setCost(new Tariffe("TIM", "WIND", (float)0.10));
        Cellphone.setCost(new Tariffe("WIND", "TIM", (float)0.12));

        System.out.println(c1.getCost("WIND", 100));
    }
}
