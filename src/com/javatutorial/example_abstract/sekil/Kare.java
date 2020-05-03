package com.javatutorial.example_abstract.sekil;

public class Kare extends Sekil{
    private int kosea;

    public int getKosea() {
        return kosea;
    }

    public void setKosea(int kosea) {
        this.kosea = kosea;
    }


    @Override
    public double alanHesapla() {
        return kosea*kosea;
    }

    @Override
    public double cevreHesapla() {
        return kosea*4;
    }

}
