package com.company.example_vererbung;

public class GiroKonto extends Konto {
    double dispo;

    public GiroKonto() {
    }

    void auszahlen(double miktar){
        setKtStand(getKtStand()+dispo-miktar);
    }
}
