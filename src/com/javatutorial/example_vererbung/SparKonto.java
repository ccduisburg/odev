package com.javatutorial.example_vererbung;

public class SparKonto extends Konto {
    void ausZahlun(double miktar){
        setKtStand(getKtStand()-miktar);
    }

}
