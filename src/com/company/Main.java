package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter an first integer: ");
        Double sayi1 = keyboard.nextDouble();
        System.out.println("enter an second integer: ");
        Double sayi2 = keyboard.nextDouble();

        Boolean sonuc1 =karsilastirma(sayi1,sayi2);
        Boolean sonuc2 =karsilastirma(sayi2,sayi1);
        if(sonuc1){
            System.out.println("1. Sayi Büyüktür");
        }else if(sonuc2){
            System.out.println("2. sayi büyüktür");
        } else {
            System.out.println("Iki sayi birbirine esittir");
        }

        System.out.println("--------------------------");
        System.out.println("1-Toplama");
        System.out.println("2-Cikarma");
        System.out.println("3-Carpma");
        System.out.println("4-Bölme");
        System.out.println("--------------------------");
        System.out.println("Bir islem seciniz...");
        int islem = keyboard.nextInt();
        //Ödev 2 Bu blogu if ile yaziniz sürekli basa dönsün
        switch (islem){
            case 1:
                System.out.println(toplama(sayi1,sayi2));
                break;
            case 2:
                System.out.println(cikarma(sayi1,sayi2));
                break;
            case 3:
                System.out.println(carpma(sayi1,sayi2));
                break;
            case 4:
                System.out.println(bolme(sayi1,sayi2));
                break;
            default:
                System.out.println("yanlis secim yaptiniz");
                break;
        }


     //   System.out.println(sonuc(deger1,deger2));


    }

    private static Boolean karsilastirma (double deger1, double deger2){
        if (deger1>deger2){
            return true;
        }  else{
            return false;
        }

    }
//https://www.w3schools.com/
//https://www.tutorialspoint.com/java/index.htm

    private static Double toplama(double sayi1, double sayi2){

        Double sonuc =(sayi1+sayi2);

        return sonuc;
    }

    private static Double cikarma(double sayi1, double sayi2){
        Double sonuc=sayi1-sayi2;
       return sonuc;
    }

    private static Double bolme(double sayi1, double sayi2){
        Double sonuc=sayi1/sayi2;
        return sonuc;
    }

    private static Double carpma(double sayi1,double sayi2){
        Double sonuc=sayi1*sayi2;
        return sonuc;
    }
}
