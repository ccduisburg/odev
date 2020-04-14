package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an first integer: ");
        int sayi1 = keyboard.nextInt();
        System.out.println("enter an second integer: ");
        int sayi2 = keyboard.nextInt();

     //   System.out.println(sonuc(deger1,deger2));
        Boolean sonuc1 =karsilastirma(sayi1,sayi2);
        Boolean sonuc2 =karsilastirma(sayi2,sayi1);
        if(sonuc1){
            System.out.println("1. Sayi Büyüktür");
        }else if(sonuc2){
            System.out.println("2. sayi büyüktür");
        } else {
            System.out.println("Iki sayi birbirine esittir");
        }
    }

    private static Boolean karsilastirma (Integer deger1, Integer deger2){
        if (deger1>deger2){
            return true;
        }  else{
            return false;
        }

    }
}
