package com.javatutorial.example_interface.sekil;

import com.javatutorial.example_abstract.sekil.Dikdortgen;
import com.javatutorial.example_abstract.sekil.Kare;
import com.javatutorial.example_abstract.sekil.Sekil;

public class MainSekil {
    public static void main(String[] args) {
        Kare k1 = new Kare();
        k1.setKosea(5);

        Dikdortgen d1 = new Dikdortgen();
        d1.setKosea(4);
        d1.setKoseb(6);

        Sekil s1 = new Kare();

        System.out.println("Karenin alani " + s1.alanHesapla());
        System.out.println("Karenin cevresi  " + s1.cevreHesapla());
        s1 = new Dikdortgen();

        System.out.println("Dikdörtgenin alani " + s1.alanHesapla());
        System.out.println("Dikdörtgenin Cevresi " + s1.cevreHesapla());


        System.out.println("Karenin alani  --" + k1.alanHesapla());
        System.out.println("Dikdörtgen alani  --" + d1.alanHesapla());
        System.out.println("Karenin cevresi  --" + k1.cevreHesapla());
        System.out.println("Dikdörtgen cevre  --" + d1.cevreHesapla());
    }
}
