package main;

import classi.Cittadino;

public class Main {
    public static void main(String[] args) throws Exception {
        Cittadino c = new Cittadino("viktor", "cognome", "26-01-1900", "Torino", "CF", "indirizzoDiResidenza");
        System.out.println(c.toString());
    }
}
