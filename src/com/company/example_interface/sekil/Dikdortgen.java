package com.company.example_interface.sekil;

public class Dikdortgen implements Sekil {
    private int kosea;
    private int koseb;

    public int getKosea(){
        return kosea;
    }
    public void setKosea(int k){
        this.kosea=k;
    }

    public int getKoseb() {
        return koseb;
    }

    public void setKoseb(int koseb) {
        this.koseb = koseb;
    }


    @Override
    public double alanHesapla() {
        return 0;
    }

    @Override
    public double cevreHesapla() {
        return 0;
    }
}
