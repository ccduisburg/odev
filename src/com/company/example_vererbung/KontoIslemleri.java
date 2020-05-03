package com.company.example_vererbung;

public class KontoIslemleri {
    public static void main(String[] args) {
        Konto konto =new Konto();
        konto.einzahlen(150);
        GiroKonto grKonto=new GiroKonto();
        SparKonto spKonto=new SparKonto();
        System.out.println(spKonto.getKtStand());
        spKonto.ausZahlun(20);
        System.out.println(spKonto.getKtStand());
        grKonto.auszahlen(20);
        System.out.println(spKonto.getKtStand());
        System.out.println(konto.getKtStand());

    }

}
