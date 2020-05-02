package com.company.sekil;

public class Dikdortgen extends Sekil {
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
        return kosea*koseb;
    }

    @Override
   public double cevreHesapla() {
        return 2*kosea+2*koseb;
    }
}
