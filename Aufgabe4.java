package com.company;

import java.util.Scanner;

public class Aufgabe4 {
    protected int[] tastatur = new int[100];
    protected int[] usb = new int[100];

    public Aufgabe4(int[] array1, int[] array2) {
        this.tastatur = array1;
        this.usb = array2;
    }

    public void run() {

        System.out.println("Die billigste Tastatur ist: ");
        System.out.println(pr1());

        System.out.println("Das teuerste Gegenstand ist: ");
        System.out.println(pr2());

        System.out.println("Das teuerste UBS das Markus kaufen kann ist: ");
        System.out.println(pr3(50));

        System.out.println("Das teuerste UBS und Tastatur das Markus kaufen kann ist: ");
        System.out.println(pr4(59));
    }


    public int pr1() {

        //afisam cel mai mic numar
        int min = this.tastatur[0];
        for(int i:this.tastatur){
            if(i < min)
                min = i;
        }
        return min;
    }


    public int pr2() {
        int max = this.tastatur[0];

        //afisam cel mai mare numar
        for(int i : this.usb){
            if(i > max)
                max = i;
        }
        for(int i : this.tastatur){
            if(i > max)
                max = i;
        }

        return max;
    }

    public int pr3(int b) {
        int max = 0;
        //afisam cel mai scump usb in functie de buget
        for(int i : this.usb){
            if(i <= b && i > max)
                max = i;
        }

        return max;
    }

    public int pr4(int b) {
        int max= -1;
        //calculam suma maxima in functie de buget
        for(int i:this.tastatur)
            for(int j:usb)
                if(i+j <= b && max < i+j)
                    max = i+j;

        return max;
    }

}
