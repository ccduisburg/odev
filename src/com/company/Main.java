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
       String sonuc =karsilastirma(sayi1,sayi2);
        System.out.println(sonuc);

    }

    private static String karsilastirma (Integer deger1, Integer deger2){
        if (deger1>deger2){
            return "ilk deger büyük";
        }  else if(deger1==deger2){
            return "iki deger esittir";
        }else{
            return "ikinci deger büyük";
        }

    }
}
