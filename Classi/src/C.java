public class C extends B {
    @Override
    public void m2() {
        System.out.println("m2 di C");
    }

    @Override // annotazioni sono meta-informazioni che dicono al compilatore come comportarsi o a delle librerie a runtime
    public void m3() {
        System.out.println("m3 di C");
    }
    
    
}
