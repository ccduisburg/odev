package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an first integer: ");
        int deger1 = keyboard.nextInt();
        System.out.println("enter an second integer: ");
        int deger2 = keyboard.nextInt();
        System.out.println(sonuc(deger1,deger2));

    }

    private static String sonuc(Integer deger1, Integer deger2){
        if (deger1>deger2){
            return "ilk deger büyük";
        } else {
            return "ikinci deger büyük";
        }

    }
}
